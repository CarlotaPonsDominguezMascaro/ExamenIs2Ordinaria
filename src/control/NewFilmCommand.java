package control;

import model.Movie;
import view.MovieDisplay;

import java.util.ArrayList;
import java.util.List;

public class NewFilmCommand implements Command {
    private final List<Movie> movies;
    private final MovieDisplay movieDisplay;

    public NewFilmCommand(List<Movie> movies, MovieDisplay movieDisplay) {
        this.movies = movies;
        this.movieDisplay = movieDisplay;
    }

    @Override
    public void executed() {
        movieDisplay.display(newFilms());
    }

    private List<Movie> newFilms() {
        List<Movie> movePerYear = new ArrayList<>();
        Movie save = movies.get(0);
        for (int i = 0; i < movies.size(); i++) {
            save = movies.get(i);
            for (int j = i+1; j < movies.size(); j++) {
                if (save.getYear() < movies.get(j).getYear() && !movePerYear.contains(movies.get(j).getYear())) {
                    save = movies.get(j);
                }
            }
            movePerYear.add(save);
        }

        return movePerYear;


    }
}
