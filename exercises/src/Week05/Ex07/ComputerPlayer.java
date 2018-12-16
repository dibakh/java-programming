package Ex07;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {
    @Override
    public String getPlayer() {
        return "Computer";
    }

    @Override
    public String getMovemen() {
        Random random = new Random();
        int position = random.nextInt(3);
        List<String> movement = Arrays.asList("rock", "scissors", "paper");
        return movement.get(position);


    }
}
