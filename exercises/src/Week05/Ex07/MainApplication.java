package Ex07;

import java.util.Arrays;
import java.util.List;

public class MainApplication {


    public static void main(String[] args) {

        Answers answers = new Answers();

        List<String> moves = Arrays.asList("rock", "scissors", "paper");

        System.out.println("Let’s play rock, paper, scissors!");

//        Move move1 = player1.choose();
        displayOptions();
        String humansChoice = answers.getChoiceOfHuman();
        while (!moves.contains(humansChoice)) {
            displayOptions();
            humansChoice = answers.getChoiceOfHuman();
        }
        String computerChoice = answers.getChoiceOfComputer();
        displayAnswers(humansChoice, computerChoice);
        DecisionMaker decisionMaker = new DecisionMaker();
        decisionMaker.displayWinner(humansChoice, computerChoice);


    }

    private static void displayOptions() {
        System.out.println("These are your options: ROCK, PAPER, SCISSORS.");
        System.out.println("Choose one :");
    }


    private static void displayAnswers(String humansChoice, String computerChoice) {
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

//        System.out.println(humanPlayer.getPlayer() + "choose : " + humansChoice);
        System.out.println(computerPlayer.getPlayer() + "choose : " + computerChoice);
    }


}
