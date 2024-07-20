import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int numberOfTries = 0;

        while (true) {
            System.out.println("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            numberOfTries++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }
}
