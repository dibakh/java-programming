package ex02;


import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NumberFilterTest {
    private NumberFilter numberFilter = new NumberFilter();

    private static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        return numbers;
    }

    private List<Integer> numbers = getNumbers();

    @Test
    public void getEven() {
        List<Integer> answer = numberFilter.getEven(numbers);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);

        Assert.assertEquals(answer, expected);
    }

    @Test
    public void getOdd() {

        List<Integer> answer = numberFilter.getOdd(numbers);
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9);
        Assert.assertEquals(answer, expected);
    }
}