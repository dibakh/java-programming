package ex02;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {

        NickNameGartherer nickNameGatherer = new NickNameGartherer();
        NickNameCreator nickNameCreator = new NickNameCreator();

        List<String> names = nickNameGatherer.gather();
        List<String> nickNames = nickNameCreator.creator(names);

        System.out.println("Nicknames : " + nickNames);

    }
}
