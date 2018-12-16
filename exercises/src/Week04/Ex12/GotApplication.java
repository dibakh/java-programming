package Ex12;

import java.util.*;

public class GotApplication {
    public static void main(String[] args) {
        CharacterReader characterReader = new CharacterReader();
        List<Character> characters = characterReader.getCharacters("Ex12/got-characters.csv");
        characters.remove(0);
        System.out.println("Number of characters: " + characters.size());
        defineGender(characters);
        defineBooksDead(characters);

//        for (Character character : characters) {
//
//            System.out.println(character.getName() + " | " + character.getBookOfDeath() + " | " + character.getGender());
//
//        }
    }

    private static void defineBooksDead(List<Character> characters) {
        Map<Integer, Integer> books = defineMapOfBooks();
        defineDeadOfEachBook(characters, books);

        Map<Integer,Integer> resultBook= new HashMap<Integer, Integer>(books);
        System.out.println("Book: " + resultBook.keySet() + " | Dead : " + resultBook.values());

    }

    private static void defineDeadOfEachBook(List<Character> characters, Map<Integer, Integer> books) {
        Integer value;
        for (Character character : characters) {
            if (!character.getBookOfDeath().isEmpty()) {
                String bookOfDeath = character.getBookOfDeath();
                Integer key = Integer.valueOf(bookOfDeath);
                value = books.get(key) + 1;
                books.put(key, value);
            }
        }
    }

    private static Map<Integer, Integer> defineMapOfBooks() {
        Integer value = 0;
        Map<Integer, Integer> books = new HashMap<>();
        books.put(1, 0);
        books.put(2, 0);
        books.put(3, 0);
        books.put(4, 0);
        books.put(5, 0);
        return books;
    }

    private static void defineGender(List<Character> characters) {
        Integer men = 0;
        Integer women = 0;
        Integer total = 0;
        for (Character character : characters) {
            if (!character.getBookOfDeath().isEmpty()) {
                total++;
                String gender = character.getGender();
                if (gender.equals("1")) {
                    men++;
                } else {
                    women++;
                }
            }
        }
        printReport(men, women, total);

    }

    private static void printReport(Integer men, Integer women, Integer total) {
        System.out.println("Number of dead characters: " + total);
        System.out.println("Dead men: " + men + " and dead women: " + women);

        Double percentDeadMen = Double.valueOf((men * 100) / total);
        Double percentDeadWomen = Double.valueOf((women * 100) / total);

        System.out.println("Dead men: " + percentDeadMen + "% and dead women: " + percentDeadWomen + "% .");
    }
}


