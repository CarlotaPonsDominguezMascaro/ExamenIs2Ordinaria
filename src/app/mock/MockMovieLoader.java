package app.mock;

import model.Genre;
import model.Movie;
import view.MoviesLoader;

import java.util.ArrayList;
import java.util.List;

public class MockMovieLoader implements MoviesLoader {

    private   List<Movie> createMovies(){
        List<String> actors = new ArrayList<>();
        actors.add("Adam");
        actors.add("Jenifer");
        actors.add("Robert");
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("image1", "title1", "director1", actors, 1990,1, Genre.ACTION,120,50));
        movies.add(new Movie("image2", "title2", "director2", actors, 1991,5, Genre.COMEDY,120,30));
        movies.add(new Movie("image3", "title3", "director3", actors, 1999,4, Genre.ROMANCE,120,2));

        return movies;
    }

    @Override
    public List<Movie> load() {

        return createMovies();
    }
}
