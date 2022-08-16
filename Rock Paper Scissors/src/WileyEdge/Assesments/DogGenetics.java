package WileyEdge.Assesments;

import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 100;
        int A = (int) (Math.random() * N);
        int B = (int) (Math.random() * (N - A));
        int C = (int) (Math.random() * (N - (A + B)));
        int D = (int) (Math.random() * (N - (A + B + C)));
        int E = N - A - B - C - D;
        System.out.println("What is your dogs name?");
        String dogName = scan.nextLine();
        System.out.println("I have some interesting information for you!\n\n" + dogName + " is:");
        System.out.println(A + "% St. Bernard\n" +
                B + "% Chihuahua\n" +
                C + "% Dramatic RedNosed Asian Pug\n" +
                D + "% Common Cur\n" +
                E + "% King Doberman\n\n" +
                "Wow your Dog is awesome!");

    }
}
