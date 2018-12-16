package EX10;


import Ex07.Topic;
import Ex09.FileReader;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {
    //    Create the TopicReader class that has a FileReader as an attribute.
    private FileReader fileReader = new FileReader();


    //    It has the getTopics method that
    //    uses the File Reader to read the topics.txt file,
    //    transform every line into one Topic and returns the list of topics.
    public List<Topic> getTopic() {
        List<String> lines = fileReader.asLines("EX10/topics.txt");
        List<Topic> topics = new ArrayList<>();
        for (String line : lines) {
            topics.add(new Topic(line));
        }
        return topics;
    }
}
