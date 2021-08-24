import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Please enter any number for triangle height");
        number = scanner.nextInt();

        for (int i = number-1; i >=0; i--) {

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
