package Design.MovieBookingSystem;

import Design.MovieBookingSystem.Enum.City;

import java.util.*;

public class MovieController {
    private Map<City, List<Movie>> cityVsMoviesMap;
    private List<Movie> movieList;

    public MovieController() {
        cityVsMoviesMap = new HashMap<>();
        movieList = new ArrayList<>();
    }

    public void addMovie(City city, Movie movie) {
        movieList.add(movie);

        List<Movie> movies = cityVsMoviesMap.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMoviesMap.put(city, movies);
    }

    public Movie searchMovie(String name) {
        Optional<Movie> movie = movieList.stream().filter(m -> m.getMovieName().equals(name)).findFirst();
        if (movie.isPresent()) {
            return movie.get();
        }
        return null;
    }

    List<Movie> getMoviesByCity(City city) {
        return cityVsMoviesMap.get(city);
    }
    //REMOVE movie from a particular city, make use of cityVsMovies map

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list

}
