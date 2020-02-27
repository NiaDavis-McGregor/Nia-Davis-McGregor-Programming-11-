import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nLet's play rock, paper, scissors! 'r' for rock, 'p' for paper, and 's' for scissors.");

            String userChoice;
        int userWins = 0;
        int userLosses = 0;

            do {
                int compChoice = (int) (Math.random() * 75);
                System.out.println("*************************************************************");

                System.out.print("Your choice: ");
                userChoice = (scan.next());

                boolean userRock = (userChoice.equals("r"));
                boolean userPaper = (userChoice.equals("p"));
                boolean userScissors = (userChoice.equals("s"));
                boolean userExit = (userChoice.equals("x"));
                boolean userValid = (userChoice.equals("r") || userChoice.equals("p") || userChoice.equals("s"));
                boolean compRock = (compChoice >= 50);
                boolean compPaper = (compChoice <= 24);
                boolean compScissors = (compChoice >= 25 && compChoice <= 49);
                boolean compValid = (compRock || compPaper || compScissors);


                if (compRock && userRock) {
                    System.out.println("It's a draw!");
                } else if (compRock && userPaper) {
                    System.out.println("You win!");
                } else if (compRock && userScissors) {
                    System.out.println("You lost!");
                } else if (compPaper && userRock) {
                    System.out.println("You lost!");
                } else if (compPaper && userPaper) {
                    System.out.println("It's a draw!");
                } else if (compPaper && userScissors) {
                    System.out.println("You win!");
                } else if (compScissors && userRock) {
                    System.out.println("You win!");
                } else if (compScissors && userPaper) {
                    System.out.println("You lost!");
                } else if (compScissors && userScissors) {
                    System.out.println("It's a draw!");
                }

                if (userRock) {
                    System.out.print("Player choice: rock");
                } else if (userPaper) {
                    System.out.print("Player choice: paper");
                } else if (userScissors) {
                    System.out.print("Player choice: scissors");
                } else if (userExit) {
                    System.out.println("You chose to exit.");
                }

                if (compRock && userValid) {
                    System.out.println("\t\tComputer choice: rock");
                } else if (compPaper && userValid) {
                    System.out.println("\t\tComputer choice: paper");
                } else if (compScissors && userValid) {
                    System.out.println("\t\tComputer choice: scissors");
                } else if (compValid && userExit) {
                    System.out.println("Thank you for playing!");
                    System.out.println("Final score:\tWins: " + userWins + "\t\tLosses: " + userLosses);
                } else {
                    System.out.println("Invalid choice, please start again.");
                    System.out.println("Final score:\tWins: " + userWins + "\t\tLosses: " + userLosses);
                }

                if ((compRock && userPaper || compPaper && userScissors || compScissors && userRock) && userValid) {
                    System.out.println("Wins: " + ++userWins + "\t\tLosses: " + userLosses);
                } else if ((compRock && userScissors || compPaper && userRock || compScissors && userPaper) && userValid) {
                    System.out.println("Wins: " + userWins + "\t\tLosses: " + ++userLosses);
                } else if ((compRock && userRock || compPaper && userPaper || compScissors && userScissors) && userValid)
                    System.out.println("Wins: " + userWins + "\t\tLosses: " + userLosses);
            } while(userChoice.equals("r") || userChoice.equals("p") || userChoice.equals("s"));
    }
}
