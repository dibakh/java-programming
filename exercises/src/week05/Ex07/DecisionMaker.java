package Ex07;

public class DecisionMaker {
    public void displayWinner(String humanChoice, String computerChoice) {
        if (humanChoice.equals("scissors")) {
            if (computerChoice.equals("paper")) {
                System.out.println("Human wooon!!!");
            } else if (computerChoice.equals("rock")) {
                System.out.println("Computer wooon!!!!");
            } else {
                System.out.println("You have choosen the same !!!!");
            }
        }
        if (humanChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                System.out.println("Human wooon!!!!");
            } else if (computerChoice.equals("scissors")) {
                System.out.println("Computer wooon!!!!");
            } else {
                System.out.println("You have choosen the same !!!!");
            }
        }
        if (humanChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("Human wooon!!!!");
            } else if (computerChoice.equals("paper")) {
                System.out.println("Computer wooon!!!!");
            } else {
                System.out.println("You have choosen the same !!!!");
            }
        }
    }

}
