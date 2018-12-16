package Ex07SecondTry;

import java.util.HashMap;
import java.util.Map;

public class Judge {

    private Map<String,String> winnerCases= getWinnerCases();

    private HashMap<String, String> getWinnerCases() {
        HashMap<String, String> map = new HashMap<>();
        map.put("rock","scissors");
        map.put("scissors","paper");
        map.put("paper","rock");
        return map;
    }

    public String getWinner(Move move1, Move move2) {
        if(areTheSame(move1, move2)){
            return "Nobody wins";
        }

        if (player1wins(move1,move2)){
            return "Player 1 wins";

        }

        return "Player 2 wins";
    }

    private boolean areTheSame(Move move1, Move move2) {
        return move1.getName().equals(move2.getName());
    }

    private boolean player1wins(Move move1, Move move2) {
        String winnerCase = winnerCases.get(move1.getName());
        return move2.equals(winnerCase);
    }
}
