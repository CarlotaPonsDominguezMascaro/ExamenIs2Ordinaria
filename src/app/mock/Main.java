package app.mock;


import control.*;
import model.Movie;

import java.util.*;

public class Main {
    private HashMap<String, Command> commands;

    private MockMovieDisplay movieDisplay ;


    public static void main(String[] args) {

        new Main().executed();
    }

    public Main() {
        movieDisplay = new MockMovieDisplay();
        List<Movie> movies = new MockMovieLoader().load();
        creatCommands(movies);



    }

    private  void executed() {
        System.out.println("Indique como quiere ordenar las peliculas, G por generos, H por mejor valoradas, N por mas nuevas , T para las mas vistas y E para salir");
        while (true) {
            Scanner scanner = new Scanner(System.in);

            String input = input(scanner);

            if (commands.containsKey(input)) {

                commands.get(input).executed();

            }
        }
    }

    private void creatCommands(List<Movie> movies){
        commands = new HashMap<>();
        commands.put("G", new GenreCommand(movies,movieDisplay));
        commands.put("H", new HigherReviewCommand(movies,movieDisplay));
        commands.put("N", new NewFilmCommand(movies,movieDisplay));
        commands.put("T", new TrendingCommand(movies,movieDisplay));
        commands.put("E",new ExitCommand());
    }

    private String input(Scanner scanner) {
        return scanner.next().toUpperCase();
    }


}
