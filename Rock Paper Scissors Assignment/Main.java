import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Rock paper scissors
        System.out.println("\nLet's play rock, paper, scissors! 'r' for rock, 'p' for paper, and 's' for scissors.");

        // Makes the computer choose a random number up to 75 (so it's a number that is pretty much equally split in 3):
        int compChoice = (int) (Math.random() * 75);
        // Gets user input as a string:
        String userChoice = (scan.next());

        /* Assigns names to the possible user and computer choices. For example, if the computer generates a number
        equal to or higher than 50, that means the computer chose rock. Also if the user chose one of the 3 letters
        and not something else, I called it userValid because I needed that later on. */
        boolean userRock = (userChoice.equals("r"));
        boolean userPaper = (userChoice.equals("p"));
        boolean userScissors = (userChoice.equals("s"));
        boolean userValid = (userChoice.equals("r") || userChoice.equals("p") || userChoice.equals("s"));
        boolean compRock = (compChoice >= 50);
        boolean compPaper = (compChoice <= 25);
        boolean compScissors = (compChoice > 25 && compChoice < 50);

        // This is so the computer knows who has won the game with every possible user and computer choice combination.
        if (compRock && userRock) {
            System.out.println("It's a draw!");
        }
        else if (compRock && userPaper) {
            System.out.println("You win!");
        }
        else if (compRock && userScissors) {
            System.out.println("You lost!");
        }
        else if (compPaper && userRock) {
            System.out.println("You lost!");
        }
        else if (compPaper && userPaper) {
            System.out.println("It's a draw!");
        }
        else if (compPaper && userScissors) {
            System.out.println("You win!");
        }
        else if (compScissors && userRock) {
            System.out.println("You win!");
        }
        else if (compScissors && userPaper) {
            System.out.println("You lost!");
        }
        else if (compScissors && userScissors) {
            System.out.println("It's a draw!");
        }

        // This is so it says what your choice was when you choose 'r', 'p', or 's'.
        if (userRock) {
            System.out.print("Your choice = rock");
        }
        else if (userPaper) {
            System.out.print("Your choice = paper");
        }
        else if (userScissors) {
            System.out.print("Your choice = scissors");
        }

        /* Says what the computer chose when it generated a number between 0 and 75, but only if the user choice is
        valid. If the user choice is not a valid choice, it will not say what the computer chose. */
        if (compRock && userValid) {
            System.out.println("\t\tComputer choice = rock");
        }
        else if (compPaper && userValid) {
            System.out.println("\t\tComputer choice = paper");
        }
        else if (compScissors && userValid) {
            System.out.println("\t\tComputer choice = scissors");
        }
        else{
            System.out.println("Invalid choice, please start again.");
        }
    }
}
