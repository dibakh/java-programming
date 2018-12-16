package Ex07;

import java.util.Scanner;

public class HumanPlayer implements Player {
    @Override
    public String getPlayer() {
        return "Human";
    }

    @Override
    public String getMovemen() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
