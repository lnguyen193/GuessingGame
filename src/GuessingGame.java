import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //I am thinking about a number between 1 and 10...
        //Can you guess it?
        //4
        //It's too low. Guess again.
        //6
        //It's too high. Guess again.
        //5
        //That's right! You are a good guesser.


        System.out.println("I am thinking about a number between 1 to 10...\nCan you guess it?");
        int number = input.nextInt();

        while (number != 2) {
            if (number > 10 || number <= 0){
                System.out.println("Error. Please enter number between 1-10!");
                number = input.nextInt();
            }

            if (number > 2) {
                System.out.println("It's too high. Guess again.");
                number = input.nextInt();

            } else if (number < 2) {
                System.out.println("It's too low. Guess again.");
                number = input.nextInt();
            }

        }
        System.out.println("That's right! You are a good guesser.");
    }
}