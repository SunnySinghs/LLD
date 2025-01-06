package Design.MovieBookingSystem;

import Design.MovieBookingSystem.Enum.City;
import Design.MovieBookingSystem.Enum.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    private MovieController movieController;
    private TheaterController theaterController;

    public BookMyShow() {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }

    public void createBooking(City userCity, String movieName) {
        //1. search movie by my location
        List<Movie> movies = movieController.getMoviesByCity(userCity);

        //2. select the movie which you want to see. i want to see Baahubali
        Movie interestedMovie = movies.stream().filter(m->m.getMovieName().equals(movieName)).findFirst().get();

        //3. get all show of this movie in Bangalore location
        Map<Theater, List<Show>> showsTheatreWise = theaterController.getAllShow(interestedMovie, userCity);

        //4. select the particular show user is interested in
        List<Show> shows = showsTheatreWise.entrySet().iterator().next().getValue();
        Show interestedShow = shows.get(0);

        //5. select the seat
        int seatNo = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();
        if (!bookedSeats.contains(seatNo)) {
            bookedSeats.add(seatNo);
            //startPayment
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for (Seat seat: interestedShow.getScreen().getSeats()) {
                if (seat.getSeatId() == seatNo) {
                    myBookedSeats.add(seat);
                }
            }
            booking.setShow(interestedShow);
            booking.setSeats(myBookedSeats);
        } else {
            //throw exception
            System.out.println("seat already booked, try again");
            return;
        }
        System.out.println("BOOKING SUCCESSFUL");
    }

    public void intialize() {
        createMovies();
        createTheater();
    }

    private void createMovies() {
        Movie movie1 = new Movie(1, "RRR", 3);
        Movie movie2 = new Movie(2, "BAAHUBALI", 3);

        movieController.addMovie(City.BANGLORE, movie1);
        movieController.addMovie(City.DELHI, movie1);
        movieController.addMovie(City.BANGLORE, movie2);
        movieController.addMovie(City.DELHI, movie2);
    }

    private void createTheater() {
        Movie RRRMovie = movieController.searchMovie("RRR");
        Movie baahubaliMovie = movieController.searchMovie("BAAHUBALI");

        Theater inoxTheater = new Theater(1);
        inoxTheater.setScreens(createScreen());
        inoxTheater.setAddress(new Address(201301, City.BANGLORE));
        List<Show> inoxShows = new ArrayList<>();
        inoxShows.add(createShows(1, inoxTheater.getScreens().get(0), RRRMovie, 12));
        inoxShows.add(createShows(2, inoxTheater.getScreens().get(0), baahubaliMovie, 16));
        inoxTheater.setShows(inoxShows);

        Theater pvrTheater = new Theater(2);
        pvrTheater.setScreens(createScreen());
        pvrTheater.setAddress(new Address(127021, City.DELHI));
        List<Show> pvrShows = new ArrayList<>();
        pvrShows.add(createShows(1, pvrTheater.getScreens().get(0), RRRMovie, 12));
        pvrShows.add(createShows(2, inoxTheater.getScreens().get(0), baahubaliMovie, 16));
        pvrTheater.setShows(pvrShows);

        theaterController.addTheatre(inoxTheater, City.BANGLORE);
        theaterController.addTheatre(pvrTheater, City.DELHI);
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }



    private List<Screen> createScreen() {
        List<Screen> screens = new ArrayList<>();
        Screen screen = new Screen(1);
        screen.setSeats(createSeats());
        screens.add(screen);
        return screens;
    }

    //creating 100 seats
    private List<Seat> createSeats() {

        //creating 100 seats for testing purpose, this can be generalised
        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat(i, 1, SeatCategory.SILVER);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat(i, 1, SeatCategory.GOLD);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat(i, 1, SeatCategory.PLATINUM);
            seats.add(seat);
        }

        return seats;
    }

}
