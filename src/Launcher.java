import java.util.Scanner;

public class Launcher {

    public static final Command[] COMMANDS = {new Fibo(), new Freq(), new Predict(), new Quit()};

    public static void main(String[] args){
        System.out.println("Bienvenu !");
        Scanner s = new Scanner(System.in);
        String variable = "";
        Command c = null;

        do {
            variable = s.nextLine();
            c = null;
            for (Command co : COMMANDS) if (c.name().contentEquals(variable)){
                c = co;
                break;
            }

            if (c == null) {
                System.out.println("Unknown command");
            }
        } while(c == null || !c.run(s));
        s.close();
    }
}