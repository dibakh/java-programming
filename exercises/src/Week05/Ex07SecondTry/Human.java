package Ex07SecondTry;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Human implements Player {

    Scanner scanner = new Scanner(System.in);

    @Override
    public Move choice() {
        List<Move> moves = Moves.getMoves();
        System.out.println(moves);
        String humanMove = scanner.nextLine();
        System.out.println("HumanMoves : " + humanMove);
        boolean contains = moves.contains(humanMove);
        System.out.println("true/false : " + contains);
        while (!contains) {
            showMessage();
            humanMove = scanner.nextLine();
        }
        int index = moves.indexOf(humanMove);
        return moves.get(index);

    }

    @Override
    public Boolean wantsToPlayAgain() {
        System.out.println(" Do you want to play again (true/false) ? ");
        return scanner.nextBoolean();
    }

    private void showMessage() {
        System.out.println("These are your options: rock, paper, scissors");
        System.out.println("Choose one:");
    }


}
