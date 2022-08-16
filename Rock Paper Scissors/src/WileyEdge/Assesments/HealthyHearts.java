package WileyEdge.Assesments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("How old are you?");
            int userAge = scan.nextInt();
            System.out.println("Your maximum heart rate should be " + (220 - userAge) + " beats per minute.");
            System.out.println("Your target HR Zone is " + (int) (0.5 * (220 - userAge)) + " - " + (int) (0.8 * (220 - userAge)) + " beats per minute.");

        } catch (InputMismatchException ime) {
            System.out.println("Wrong input format! Please re-enter.");
        }
    }

}
