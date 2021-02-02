package control;

import model.Movie;
import view.MovieDisplay;

import java.util.ArrayList;
import java.util.List;

public class HigherReviewCommand implements Command {
    private final List<Movie> movies;
    private final MovieDisplay movieDisplay;

    public HigherReviewCommand(List<Movie> movies, MovieDisplay movieDisplay) {
        this.movies = movies;
        this.movieDisplay = movieDisplay;
    }

    @Override
    public void executed() {
        movieDisplay.display(higherReviews());
    }

    private List<Movie> higherReviews() {
        List<Movie> higherRev = new ArrayList<>();
        Movie save = movies.get(0);
        for (int i = 0; i < movies.size(); i++) {
            save = movies.get(i);
            for (int j = i+1; j < movies.size(); j++) {
                if (save.getReviews() < movies.get(j).getReviews() && !higherRev.contains(save)) {
                    save = movies.get(j);
                }
            }
            higherRev.add(save);
        }

        return higherRev;


    }
}
