package WileyEdge.Assesments;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    static int userScore = 0;
    static int computerScore = 0;

    public static void main(String[] args) {
        String[] options = {"Rock", "Paper", "Scissors"};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int userChoice;
        int computerChoice;

        try {
            System.out.println("Enter how many rounds you want to play(Between 1-10): ");
            int userRoundInput = sc.nextInt();
            if (userRoundInput < 1 || userRoundInput > 10) {
                throw new InputMismatchException();
            }
            for (int i = 1; i < userRoundInput + 1; i++) {
                System.out.println("\nRound " + i);
                System.out.println("Enter your choice(Rock - 1)(Paper - 2)(Scissors - 3): ");
                userChoice = sc.nextInt();
                if (userChoice < 1 || userChoice > 3) {
                    throw new InputMismatchException();
                }
                computerChoice = random.nextInt(1, 3);
                roundOutcome(userChoice, computerChoice);
                System.out.println("Your choice: " + options[computerChoice - 1] + "\nComputer Choice: " + options[userChoice - 1]);
                if (i == userRoundInput) {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }

        } catch (InputMismatchException ime) {
            System.out.println("Wrong input! Please re-enter!");

        } catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println("\nGAME OVER!");
            if (userScore > computerScore) {
                System.out.println("You won!");
            } else if (computerScore > userScore) {
                System.out.println("Computer won!");
            } else {
                System.out.println("It was a draw");
            }
        }
    }

    public static void roundOutcome(int user, int computer) {
        if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            userScore = userScore + 1;
            System.out.println("User wins the round! Scores :  [USER -> " + userScore + "] [COMPUTER -> " + computerScore + "]");
        } else if ((computer == 1 && user == 3) || (computer == 2 && user == 1) || (computer == 3 && user == 2)) {
            computerScore = computerScore + 1;
            System.out.println("Computer wins the round! Scores :  [USER -> " + userScore + "] [COMPUTER -> " + computerScore + "]");
        } else {
            System.out.println("It was a draw!");
        }
    }
}