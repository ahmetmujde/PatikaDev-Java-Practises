import java.util.Scanner;

public class MakeDiamondsUsingStars {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Please enter any number for diamonds height");
        number = scanner.nextInt();

        for (int i = 0; i <= number ; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = number-1; i >=0  ; i--) {

            for (int j = (number - i); j > 0 ; j--) {
                System.out.print(" ");
            }

            for (int k = (2 * i + 1); k >= 1; k--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

    }
}
