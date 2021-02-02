package control;

public class ExitCommand implements Command {
    @Override
    public void executed() {
        System.exit(0);
    }
}
