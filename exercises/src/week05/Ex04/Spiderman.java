package Ex04;

public class Spiderman implements Superhero {
    @Override
    public String getName() {
        return "Spiderman";
    }
    @Override
    public String toString() {
        return getName();
    }
    @Override
    public void fight() {
    }
}
