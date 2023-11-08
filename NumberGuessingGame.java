import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + min + " and " + max + ". Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("The number is higher. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("The number is lower. Try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
        System.out.println("In " + attempts + " attempts.");
    }
}
