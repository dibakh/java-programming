package Ex05;

import Ex04.Superhero;

public class Batman implements Superhero {
    @Override
    public String getName() {
        return "Batman";
    }
    @Override
    public String toString() {
        return getName();
    }
    @Override
    public void fight() {
//        Update the Batman, Superman and Spiderman classes from exercise 4
//        with the fight method.
//        Inside it, it weakens the villain .
        Joker joker = new Joker();
        joker.weaken(getName());

    }
}
