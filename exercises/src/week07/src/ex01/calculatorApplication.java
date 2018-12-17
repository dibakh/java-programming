package ex01;

import java.util.List;


public class calculatorApplication {
    public static void main(String[] args) {
        MoneyCalculator moneyCalculator = new MoneyCalculator();

        List<Integer> payment = MoneyCollector.getList();
        Integer calculated = moneyCalculator.calculate(payment);

        System.out.println("Money collected from friends : " + payment);

        System.out.println("Total of payments are " + calculated + " euro! ");


//        An application that displays on the screen the money collected from each friend and also the total.
    }
}
