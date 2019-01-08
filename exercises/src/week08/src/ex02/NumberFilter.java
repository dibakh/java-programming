package ex02;

import java.util.ArrayList;
import java.util.List;

public class NumberFilter {
    //    Create the NumberFilter class.
//    Add to it the getEven method that receives a list of numbers and returns a list with only its even numbers.
    public List<Integer> getEven(List<Integer> numbers) {
        numbers.removeIf(number -> number % 2 != 0);
        return numbers;
    }

    //    Add to it the getOdd method that receives a list of numbers and returns a list with only its odd numbers.
    public List<Integer> getOdd(List<Integer> numbers) {
        numbers.removeIf(number -> number % 2 == 0);
        return numbers;
    }


}
