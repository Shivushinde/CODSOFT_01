import java.util.Random;
import java.util.Scanner;

public class UniqueNumberGame 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Unique Number Game!");

        while (true) 
        {
            int lowerBound = 1;
            int upperBound = 100;
            int randomNum = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attemptsLimit = 7;
            int attemptsTaken = 0;
            while (true) 
            {

                System.out.print("Enter your guess (" + lowerBound + "-" + upperBound + "): ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNum) 
                {
                    System.out.println("Congratulations! You guessed the correct number " + randomNum + " in "
                            + attemptsTaken + " attempts.");
                    break;
                } 
                else if (userGuess < randomNum) 
                {
                    System.out.println("Too low! Try again.");
                } 
                else 
                {
                    System.out.println("Too high! Try again.");
                }

                // Increment attempts
                attemptsTaken++;
                System.out.println("Attempt number: "+ attemptsTaken+ " Remaining attemps: "+ attemptsLimit);
                // Check if attempts limit reached
                if (attemptsTaken == attemptsLimit) 
                {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was "
                            + randomNum + ".");
                    break;
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) 
            {
                break;
            }
        }

        scanner.close();
    }
}
