package Ex07;

public class Answers {
    public String getChoiceOfHuman() {
        HumanPlayer humanPlayer = new HumanPlayer();
        return humanPlayer.getMovemen();
    }

    public String getChoiceOfComputer() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        return computerPlayer.getMovemen();
    }
}
