package control;

import model.Genre;
import model.Movie;
import view.MovieDisplay;


import java.util.ArrayList;
import java.util.List;

public class GenreCommand implements Command {
    private final List<Movie> movies;
    private final MovieDisplay movieDisplay;


    public GenreCommand(List<Movie> movies, MovieDisplay movieDisplay) {
        this.movies = movies;
        this.movieDisplay = movieDisplay;

    }


    @Override
    public void executed() {
        movieDisplay.display(getGenre());
    }

    private List<Movie> getGenre() {
        List<Movie> movieGenre = new ArrayList<>();
        for (int genre = 0; genre <Genre.values().length ; genre++) {

            for (Movie movie : movies) {
                if (movie.getGenre() ==Genre.values()[genre] ) {
                    movieGenre.add(movie);
                }
            }

        }


        return movieGenre;

    }
}
