package week06;

public class AddLegs implements Step {

    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("leg");
    }
}
