package Ex07SecondTry;

public class Rock implements Move {

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String getName() {
        return "rock";
    }
}
