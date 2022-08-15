package Assesment.RockPaperScissors;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rounds = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        try{
            System.out.println("Enter how many rounds you want to play(Between 1-10): ");
            int userInput = sc.nextInt();
            if(userInput < 1 || userInput > 10 ){
                throw new InputMismatchException();
            }
            for(int i = 1;i < userInput + 1; i++){
                System.out.println("Round "+ i);
                System.out.println("Enter your choice: ");
                String userChoice = sc.nextLine();
                System.out.println("\n" + rounds[random.nextInt(0,3)]);
            }
        }catch(InputMismatchException ime){
            System.out.println("Wrong input! Please re-enter!");
        }
    }
}