package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {
    private static List<Integer> payments= gatherMoney();

    public static List<Integer> gatherMoney(){
        Random random=new Random();
        List<Integer> payment=new ArrayList<>();
        for (int friend = 0; friend < 10; friend++) {
            int paid = random.nextInt(5) + 1;
            payment.add(paid);
        }

        return payment;
    }

    public static List<Integer> getList(){
        return  payments;
    }


//    private static List<Move> moves = prepareMoves();
//
//    private static List<Move> prepareMoves() {
//        Move paper = new Paper();
//        Move rock = new Rock();
//        Move scissors = new Scissors();
//        return new ArrayList<>(Arrays.asList(paper, rock, scissors));
//    }
//
//    public static List<Move> getMoves() {
//        return moves;
//    }

//    A MoneyCollector class that provides a collection containing all the different payments from his friends.
//    You can generate these numbers randomly so that his ten friends always pay each between one and five Euro.
}
