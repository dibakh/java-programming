package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameGatherer {
    public List<String> gather() {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the name : ");
        String name = scanner.nextLine();

        while (!name.isEmpty()) {
            names.add(name);
            name = scanner.nextLine();
        }

        return names;
    }
}
