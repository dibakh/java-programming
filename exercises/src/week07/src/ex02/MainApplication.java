package ex02;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        NameGatherer nameGatherer = new NameGatherer();

        List<String> names = nameGatherer.gather();
        List<String> halfOfName=new ArrayList<>();
        System.out.println(names);

        for (String name : names) {
            String firstHalf = cutFirstHalf(name);
            halfOfName.add(firstHalf);
        }

        System.out.println(halfOfName);
    }

    private static String cutFirstHalf(String name) {
        int halfOfLength = name.trim().length() / 2;
        return name.substring(0, halfOfLength);

    }
}
