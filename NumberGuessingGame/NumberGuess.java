import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean keepPlaying = true;

        System.out.println("🎯 Welcome to Number Guessing Game!");

        while (keepPlaying) {
            int targetNumber = rand.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("\nI have selected a number between 1 and 100. Try to guess it!");

            while (guess != targetNumber) {
                try {
                    System.out.print("Enter your guess: ");
                    guess = input.nextInt();
                    attempts++;

                    if (guess < 1 || guess > 100) {
                        System.out.println("Please guess a number between 1 and 100.");
                    } else if (guess < targetNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > targetNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("🎉 Congratulations! You guessed it in " + attempts + " attempts.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    input.nextLine();
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            input.nextLine();
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("exit")) {
                keepPlaying = false;
                System.out.println("Thanks for playing! Goodbye!");
            }
        }

        input.close();
    }
}
