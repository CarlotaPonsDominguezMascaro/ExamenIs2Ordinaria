package control;

import model.Movie;
import view.MovieDisplay;

import java.util.ArrayList;
import java.util.List;

public class TrendingCommand implements Command{
    private final List<Movie> movies;
    private final MovieDisplay movieDisplay;

    public TrendingCommand(List<Movie> movies, MovieDisplay movieDisplay) {
        this.movies = movies;
        this.movieDisplay = movieDisplay;
    }

    @Override
    public void executed() {
        movieDisplay.display(trending());

    }
    private List<Movie> trending() {
        List<Movie> movieTrending = new ArrayList<>();
        Movie save = movies.get(0);
        for (int i = 0; i < movies.size(); i++) {
            save = movies.get(i);
            for (int j = i+1; j < movies.size(); j++) {
                if (save.getPeopleWhoWatchIt() < movies.get(j).getPeopleWhoWatchIt() && !movieTrending.contains(movies.get(j).getPeopleWhoWatchIt())) {
                    save = movies.get(j);
                }
            }
            movieTrending.add(save);
        }


        return movieTrending;


    }
}
