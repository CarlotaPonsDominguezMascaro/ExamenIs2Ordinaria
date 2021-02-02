package app.mock;

import model.Movie;
import view.MovieDisplay;

import java.util.List;

public class MockMovieDisplay implements MovieDisplay {
    private List<Movie> movies;
    @Override
    public void display(List<Movie> movies) {
        this.movies = movies;
        for (Movie movie:movies){
            System.out.println(movie);
        }

    }
}
