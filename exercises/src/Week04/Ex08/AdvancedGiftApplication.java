package Ex08;

import java.util.Optional;

public class AdvancedGiftApplication {
    public static void main(String[] args) {
//        Christmas is coming and Derek’s new working colleges want to organize an “invisible friend” present giving in their
//        company.
//                Create the AdvancedGiftApplication class and write the following instructions in its main method:

        // Create an empty giftBox Optional of Box and display it.
        Optional<Box> giftBox= Optional.empty();
        System.out.println(giftBox);

        // Create a Box with a present name as content .
        Box box = new Box("Robotoy");

        // Assign an Optional of Box to the giftBox containing the previous Box and display it.
        giftBox=Optional.of(box);
        System.out.println(giftBox.toString());

        // Ask if the giftBox is present and display the answer.
        if (giftBox.isPresent()){
            System.out.println(" giftBox is present ! ");
        }

        // Get the value contained in giftBox and display it. To display the Box class create the toString method.
        System.out.println(giftBox.get().toString());









    }
}
