package Design.MovieBookingSystem;

import Design.MovieBookingSystem.Enum.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    private Map<City, List<Theater>> cityVsTheater;
    private List<Theater> allTheater;

    public TheaterController() {
        cityVsTheater = new HashMap<>();
        allTheater = new ArrayList<>();
    }

    void addTheatre(Theater theater, City city) {

        allTheater.add(theater);

        List<Theater> theatres = cityVsTheater.getOrDefault(city, new ArrayList<>());
        theatres.add(theater);
        cityVsTheater.put(city, theatres);
    }

    public Map<Theater, List<Show>> getAllShow(Movie movie, City city) {
        //get all the theater of this city
        Map<Theater, List<Show>> theaterVsShows = new HashMap<>();
        List<Theater> theaters = cityVsTheater.get(city);

        //filter the theatres which run this movie
        for (Theater theater: theaters) {
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theater.getShows();
            for (Show show: shows) {
                if (show.getMovie().getMovieId() == movie.getMovieId()){
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theaterVsShows.put(theater, givenMovieShows);
            }
        }
        return theaterVsShows;
    }


}
