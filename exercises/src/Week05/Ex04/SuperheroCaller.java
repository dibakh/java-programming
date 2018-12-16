package Ex04;

import java.util.*;

public class SuperheroCaller {
    //    Create the SuperheroCaller class that has a list with the three superheroes.
//    It has the call method that returns a random Superhero every time you use it.
    private List<Superhero> superheroes = Arrays.asList(new Batman(), new Superman(), new Spiderman());
    private Random random = new Random();
    public Superhero call() {
        int position = random.nextInt(3);
        Superhero hero = superheroes.get(position);
        return hero;
    }

}
