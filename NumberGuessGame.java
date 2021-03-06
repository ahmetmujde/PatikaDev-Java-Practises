import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner sc = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrongNumbers = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5) {
            System.out.println("Please enter your guessed number: ");
            selected = sc.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter the between 1 and 100.");
                if (isWrong) {
                    right++;
                    System.out.println("You made too many incorrect entries. Remaining Right : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong entry will be deducted from right.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Congratulations, Your guess is true ! Your guessed number : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Your enter the wrong number !");
                if (selected > number) {
                    System.out.println(selected + " number , bigger than secret number.");
                } else {
                    System.out.println(selected + " number, less than secret number.");
                }

                wrongNumbers[right++] = selected;
                System.out.println("Remaining Right : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Your lose! ");
            if (!isWrong) {
                System.out.println("Your guesses : " + Arrays.toString(wrongNumbers));
            }
        }

    }
}
