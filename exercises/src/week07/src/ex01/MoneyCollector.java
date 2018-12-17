package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {
    private Random random=new Random();

    public List<Integer> gatherMoney(){
        List<Integer> payment=new ArrayList<>();
        for (int friend = 0; friend < 10; friend++) {
            int paid = random.nextInt(6) + 1;
            payment.add(paid);
        }

        return payment;
    }
//    A MoneyCollector class that provides a collection containing all the different payments from his friends.
//    You can generate these numbers randomly so that his ten friends always pay each between one and five Euro.
}
