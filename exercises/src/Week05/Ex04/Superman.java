package Ex04;

public class Superman implements Superhero {
    @Override
    public String getName() {
        return "Superman";
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public void fight() {

    }
}
