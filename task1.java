import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0;
        int playCount = 0;

        while (true) {
            int secretNumber = random.nextInt(100) + 1;
            int maxAttempts = 5;
            int attempts = 0;

            System.out.println("Round " + (playCount + 1));

            while (true) {
                System.out.print("Guess the number (between 1 and 100): ");
                int guess = scanner.nextInt();

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + "!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Your guess is too high. Try again.");
                }

                attempts++;

                if (attempts >= maxAttempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
                    break;
                }
            }

            if (attempts < maxAttempts) {
                score++;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            playCount++;
        }

        System.out.println("Your final score is " + score + " out of " + (playCount + 1) + " rounds.");
        scanner.close();
    }
}
