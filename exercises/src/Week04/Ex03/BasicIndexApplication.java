package Ex03;


import java.util.HashMap;
import java.util.Map;


//    Matilda just bought a new book about social impact and as she opens it, she sees the index
//        Create the BasicIndexApplication class and write the following instructions in its main method:
public class BasicIndexApplication {
    public static void main(String[] args) {

//        Create an empty index map connecting Integers for the page numbers and Strings for the book topics and display it.
        Map<Integer, String> books = new HashMap<Integer, String>();
        String message = "Index: ";
        displayMap(message, books);

//        Create three Integers that represent three different page numbers.
        Integer pageNumber1 = 1;
        Integer pageNumber2 = 2;
        Integer pageNumber3 = 3;

//        Create three Strings that represent three different book topics.
        String topic3 = "ecologic economy";
        String topic2 = "possitive things";
        String topic1 = "connecting";

//        Put them into the index map from biggest to smallest page number and display it to notice that the entries are automatically arranged.
        books.put(pageNumber3, topic3);
        books.put(pageNumber2, topic2);
        books.put(pageNumber1, topic1);
//          we do not need to programming because map is always sorted by first argument !!!!!!
//        Map<Integer, String> treeMap = new TreeMap<Integer, String>(Books);
//
//            for (Map.Entry<Integer, String> entry : Books.entrySet()) {
//                System.out.println("Pages : " + entry.getKey()
//                        + " Topics : " + entry.getValue());
//            }
        displayMap(message, books);

//        Display the map keys.
        System.out.println("Index keys: " + books.keySet());

//        Display the map values.
        System.out.println("Index values: " + books.values());

//        Create one String representing another book topic.
        String topic4 = "new topic";

//        Put this new topic into the same page number than an existing one and display the map to notice that the previous one is replaced.
        books.put(pageNumber1, topic4);
        message="Index entry sets: ";
        displayMap(message,books);     //?????????????????????????????

        message = "Index: ";
        displayMap(message,books);
//        Ask if one of the keys is contained in the map and display the answer.
        if (books.containsValue(topic1)) {
            System.out.println( "The page number 1 exists as key");
        } else {
            System.out.println( "The page number 1 is not exists as key");
        }

//      Get one of them by providing its name as an argument and display it.
        System.out.println("The topic in page number 3 is "+books.get(3)); // position 0 ???????

//      Display its size.
        message= "Index size: ";
        System.out.println(message + books.size());

    }

    private static void displayMap(String message, Map<Integer, String> books) {
        System.out.println(message + books);
    }
}


