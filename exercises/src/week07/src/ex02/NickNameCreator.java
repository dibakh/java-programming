package ex02;


import java.util.ArrayList;
import java.util.List;

public class NickNameCreator {

    public List<String> creator(List<String> names) {

        List<String> nickNames = new ArrayList<>();

        for (String name : names) {
            int lengthOfName = name.length();

            if (lengthOfName == 1) {
                nickNames.add(name);
            } else {

                String nickName = name.substring(0, lengthOfName / 2);
                nickNames.add(nickName);
            }

        }
        return nickNames;
    }
}


