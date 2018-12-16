package Ex07SecondTry;

public class Scissors implements Move {
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String getName() {

        return "scissors";
    }
}
