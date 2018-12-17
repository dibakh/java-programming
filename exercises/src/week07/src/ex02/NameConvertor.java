package ex02;

import java.util.ArrayList;
import java.util.List;

public class NameConvertor {
    public void convertNameToNickName() {

        NickNameGartherer nickNameGatherer = new NickNameGartherer();
        NickNameCreator nickNameCreator = new NickNameCreator();

        List<String> names = nickNameGatherer.gather();
        List<String> nickNames = nickNameCreator.creator(names);
        nickNameCreator.display(nickNames);



    }

}
