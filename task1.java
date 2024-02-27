import java.util.Random;
import java.util.Scanner;
public class task1
{
    public static void main(String[] args) {
        Scanner userip = new Scanner(System.in);
        Random generatedvalue = new Random();

        int points = 0;
        int playCount = 0;
        int attempts = 0;
        int maxAttempts = 10;

        while (true) {
            int secretNumber = generatedvalue.nextInt(100) + 1;

            System.out.println("Round " + (attempts + 1));

            while (true) {
                System.out.print("Guess the number (between 1 and 100): ");
                int guess = userip.nextInt();

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + "!");
                    break;
                } else if (guess > 100) {
                    System.out.println("Enter value within the range 1 to 100");
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else if (guess > 100) {
                    System.out.println("Enter value within the range 1 to 100");
                }

                attempts++;

                if (attempts >= maxAttempts) {
                    System.out
                            .println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
                    break;
                }
            }

            if (attempts < maxAttempts) {
                points++;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = userip.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            playCount++;
        }

        System.out.println("Your final score is " + points + " out of " + (attempts + 1) + " attempts.");
        userip.close();
    }
}
