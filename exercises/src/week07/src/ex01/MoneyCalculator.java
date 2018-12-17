package ex01;

import java.util.List;

public class MoneyCalculator {
    public Integer calculate(List<Integer> payment) {

        Integer sum = 0;
        for (Integer money : payment) {
            sum += money;
        }

        return sum;
    }
//    A MoneyCalculator that receives money numbers and returns the accumulated value.
}
