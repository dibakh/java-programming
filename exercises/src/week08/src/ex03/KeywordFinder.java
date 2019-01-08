package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {
    //    Create the KeywordFinder class.
//    Add to it the findElegant method that receives a sentence and returns the list of all its elegant words.
    private List<String> words = new ArrayList<>();

    public List<String> findElegant(String sentence) {
        words = getSplitedWords(sentence);
        return find(words, word -> word.startsWith("ele"));
    }

    public List<String> playful(String sentence) {
        words = getSplitedWords(sentence);
        return find(words, word -> word.endsWith("ful"));
    }

    private List<String> getSplitedWords(String sentence) {
        String[] split = sentence.split(" ");
        for (String word : split) {
            words.add(word);
        }
        return words;
    }

    private List<String> find(List<String> words, Predicate<String> condition) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (condition.test(word)) {
                result.add(word);
            }
        }
        return result;
    }

//    Add to it the findPlayful method that receives a sentence and returns the list of all its playful words.
//    Write tests for both methods.
//    Rules:
//    An elegant word is a word that starts with ele.
//    A playful word is a word that ends with ful.
//    You’re not allowed to duplicate code.
//    Use a Predicate<String> to avoid code duplication.
}
