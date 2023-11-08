import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //generate Random Number
        int randomNumber = random.nextInt(100);
        //counts Attempts
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + 1 + " and " + 100 + ". Try to guess it in 10 Attempts.");

        //iterate for 10 attempts
        for (int i=1; i<=10; i++ ) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber){
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                System.out.println("In " + attempts + " attempts.");
                break;
            }else if (guess < randomNumber) {
                System.out.println("The number is higher. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("The number is lower. Try again.");
            }

            if (i == 10){
                System.out.println("You Exhausted 10 rounds");
            }

        }

    }
}
