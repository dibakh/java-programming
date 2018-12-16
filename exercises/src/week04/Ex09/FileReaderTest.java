package Ex09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void asLines() {
        FileReader fileReader= new FileReader();
        List<String> result =fileReader.asLines("Ex09/lorem-ipsum.txt");
        Assertions.assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore",result);

    }
}