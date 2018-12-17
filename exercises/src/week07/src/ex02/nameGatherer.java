package ex02;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nameGatherer {
    public static List<String> gather(){
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the name : ");
        String name = scanner.nextLine();

        while (!name.isEmpty()){
            names.add(name);
            scanner.nextLine();
        }

        return names;
    }
}
