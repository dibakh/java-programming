package week06;

public class AddShelf implements Step {

    @Override
    public void perform(Furniture wardrobe) {
        wardrobe.add("shelf");
    }
}
