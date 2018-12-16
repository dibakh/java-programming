package Ex05;

import Ex04.Superhero;
import Ex04.SuperheroCaller;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
//        Create a SuperheroCaller . Reuse the one from exercise 4.
        SuperheroCaller superheroCaller = new SuperheroCaller();

//        Create one Joker .
        Joker joker = new Joker();

//        Use the SuperheroCaller ten times to call one superhero and
//        make him fight the joker .
        for (int times = 0; times < 10; times++) {
            Superhero name = superheroCaller.call();
//            name.fight(name);
            joker.weaken(name.getName());
        }


    }

}
