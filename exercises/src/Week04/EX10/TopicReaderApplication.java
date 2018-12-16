package EX10;

import Ex07.Topic;
import Ex09.FileReader;

import java.util.*;

public class TopicReaderApplication {
    public static void main(String[] args) {

//        create a TopicReader, use the getTopics method and
//        place them inside a list. Display the list of topics.
        TopicReader topicReader=new TopicReader();
        List<Topic> topics = topicReader.getTopic();
        for (Topic topic : topics) {
            System.out.println("Topic List: "+topic);
        }

//     Create a set of Topic, add the elements of the previous list
        //    and display it to notice that there happens to be duplicates.
        Set<Topic> topicSet= new HashSet<>(topics);
        for (Topic topic : topicSet) {
            System.out.println("Topic Set: "+topic);
        }
    }
}
