package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class tryLambda {
    public static void main(String[] args) {

        //Create a list of words. Make sure you use new ArrayList to have a mutable list.
        List<String> names = new ArrayList<> (Arrays.asList
                ("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));

//        Create a list of words. Make sure you use new ArrayList to have a mutable list.
        System.out.println ("----- Part1 -----");
        System.out.println (names);

        //Use the removeIf method to remove every word that ends with the letter e.
        System.out.println ("----- Part2 -----");
        names.removeIf (name -> name.endsWith ("e"));
        System.out.println (names);

//        Use the replaceAll method to transform every word in their uppercase version.
        System.out.println ("----- Part3 -----");
        names.replaceAll (name -> name.toUpperCase ( ));
        System.out.println (names);

//        Use the removeIf method to remove every word that has less than six letters.
        System.out.println ("----- Part4 -----");
        names.removeIf (name -> name.length ( ) < 6);
        System.out.println (names);

//        Use the forEach method to print every word one by one.
        System.out.println ("----- Part5 -----");
        names.forEach (name -> System.out.println (name));

    }
}
