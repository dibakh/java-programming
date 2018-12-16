package Ex07SecondTry;

import java.util.List;
import java.util.Random;

public class Computer implements Player {

    @Override
    public Move choice() {
        Random random = new Random();
        List<Move> move = Moves.getMoves();
        int position = random.nextInt(move.size());
        return move.get(position);
    }

    @Override
    public Boolean wantsToPlayAgain() {
        return null;
    }

}
