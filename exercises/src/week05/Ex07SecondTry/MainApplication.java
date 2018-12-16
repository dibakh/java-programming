package Ex07SecondTry;

public class MainApplication {
    public static void main(String[] args) {
        Human player1 = new Human();
        Computer player2 = new Computer();

        System.out.println("Let’s play rock, paper, scissors! ");
        Boolean playAgain = true;

        while (playAgain) {


            System.out.println("These are your options: rock, paper, scissors");
            System.out.print("Choose one:");

            Move move1 = player1.choice();
            System.out.println("Player 1 chose: " + move1);

            Move move2 = player2.choice();
            System.out.println("Player 2 chose: " + move2);

            Judge judge = new Judge();
            String winner = judge.getWinner(move1, move2);
            System.out.println(winner);

            playAgain = player1.wantsToPlayAgain();
        }
        System.out.println("See you next time!");


    }

}
