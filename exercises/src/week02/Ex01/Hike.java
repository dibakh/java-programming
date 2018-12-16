package Ex01;

import java.util.ArrayList;
import java.util.List;

public class Hike {
    private Gatherer gatherer = new Gatherer();
    private List<Hiker> hikers = new ArrayList<>();

    public void signup() {
        hikers = gatherer.signUp();
    }


    public void showHikers() {
        for (Hiker hiker:hikers) {
            System.out.println("Hiker : " + hiker.getName());
        }
    }


}


//
//    Matilda has organized a hiking day with his friends on the weekend, but she’s not sure who is coming.
//      She decided to create an application so they can sign up that follows the following behavior:
//        It asks for the name of the hiker
//        If they write their name and press enter, they get signed up
//        If they press enter without writing their name, it stops asking for more hikers
//        After that it displays the list of everyone who signed up
//        Develop the following code:
//        Define the Hiker data class that has a name attribute.
//        Define the Gatherer agent class that has a signUp method that asks for hiker’s names indefinitely until it receives an empty String and returns the list of hikers that signed up for the hike.

//        Define the Hike agent class that has a list of hikers as attribute.
//          It has the signUp method that gathers the hikers.
//          It has the method showHikers method that displays the hikers.

//        Define the HikeApplication class that has a main method that uses the Hike class to sign up the hikers and show them on the screen.
