package Ex07SecondTry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Moves {

    private static List<Move> moves = prepareMoves();

    private static List<Move> prepareMoves() {
        Move paper = new Paper();
        Move rock = new Rock();
        Move scissors = new Scissors();
        return new ArrayList<>(Arrays.asList(paper, rock, scissors));
    }

    public static List<Move> getMoves() {
        return moves;
    }
}
