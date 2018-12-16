package Ex07SecondTry;

public class Paper implements Move {
    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String getName() {
        return "paper";
    }
}
