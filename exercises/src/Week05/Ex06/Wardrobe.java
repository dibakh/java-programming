package Ex06;

import java.util.Arrays;
import java.util.List;

public class Wardrobe implements Furniture {
    //    Create the Wardrobe class that has a list of String
//    representing its different parts .
    //    It implements Furniture .
    List<String> differentParts = Arrays.asList("bottom", "side", "back", "top", "shelf", "door");

    @Override
    public void add(String part) {
        //    Its add method adds the part to its parts.
        System.out.println(part + "added to parts! ");

    }

    @Override
    public String toString() {
        //    Implement its toString method to display its parts .
        return "Part:" + differentParts;
    }





}
