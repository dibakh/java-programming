package Ex12;

import Ex09.FileReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterReader {
    private String characters;

    //   Create the CharacterReader class that has the getCharacters method that receives a filePath, uses a
//                FileReader to read its lines, transforms them into Characters and returns them.

    public List<Character> getCharacters(String filePath) {
        FileReader fileReader = new FileReader();
        List<String> lines = fileReader.asLines(filePath);
        return toCharacter(lines);
    }

    private List<Character> toCharacter(List<String> lines) {
        lines.remove(0);
        Character characterObject= new Character("","","");
        List<Character> characters = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.split(";");
            String name=split[0];
            String bookOfDeath=split[3];
            String gender=split[6];
            characterObject= new Character(name,bookOfDeath,gender);
            characters.add(characterObject);
        }
        return characters;
    }


}
