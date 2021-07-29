import  java.util.Scanner;

public class PowersofFourAndFiveUntilEnteredNumber {
    public static void main(String[] args){

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        number=scanner.nextInt();

        if (number>0){

            for (int i=1; i<=number; i*=4)
                System.out.println(i);

            for (int j=1; j<=number; j*=5)
                System.out.println(j);
        }

        else
            System.out.println("Please enter positive number");

    }
}
