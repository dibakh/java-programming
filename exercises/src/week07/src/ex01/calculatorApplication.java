package ex01;

import java.util.List;

public class calculatorApplication {
    public static void main(String[] args) {
        MoneyCollector moneyCollector = new MoneyCollector();
        MoneyCalculator moneyCalculator = new MoneyCalculator();

        List<Integer> payment = moneyCollector.gatherMoney();
        Integer calculated = moneyCalculator.calculate(payment);

        System.out.println("Total of payments are "+ calculated + " euro! ");


//        An application that displays on the screen the money collected from each friend and also the total.
    }
}
