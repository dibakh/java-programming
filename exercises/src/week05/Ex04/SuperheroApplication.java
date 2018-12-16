package Ex04;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {
    public static void main(String[] args) {
//        Create a SuperheroCaller and use it to call one superhero.
//        Display its name.
        SuperheroCaller superheroCaller = new SuperheroCaller();
        System.out.println("Superhero: " + superheroCaller.call());
//                Create a list of Superhero and
//                add six superheroes by calling them with the SuperheroCaller.
//                Use a lop for this, please.
        List<Superhero> superHeros = getHeros();
        for (int i = 0; i < 6; i++) {
            superHeros.add(superheroCaller.call());

        }


//                Display the superheroe names one by one with a loop by also showing the number of appearance.
//        Display the number of superheroes by using the list’s size.
//        Create the SuperheroCallerTest class to test the call method. Make sure it never returns null and that the superhero names are either Batman, Superman or Spiderman.
    }

    private static List<Superhero> getHeros() {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        List<Superhero> heroes = new ArrayList<>();
        for (int times = 0; times < 6; times++) {
            Integer counter = times + 1;
            Superhero hero = superheroCaller.call();
            heroes.add(hero);
            System.out.println("Superhero " + counter + ": " + hero);
        }
        System.out.println("Number of superheroes: " + heroes.size());
        return heroes;
    }
}
