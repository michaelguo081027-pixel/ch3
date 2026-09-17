import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int guess = in.nextInt();
        int difference = number - guess;
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        System.out.print("You were off by: " + Math.abs(difference));
    }
}
