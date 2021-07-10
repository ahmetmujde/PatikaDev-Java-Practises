import java.util.Scanner;

public class EasyCalculator {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double numberOne,numberTwo;
        int operation;

        System.out.println("Please enter the first number: ");
        numberOne=scanner.nextDouble();

        System.out.println("Please enter the second number: ");
        numberTwo=scanner.nextDouble();

        System.out.println("Please select any operation: \n 1 (+) \t2 (-) \t3 (x) \t4 (/)");
        operation=scanner.nextInt();

        switch (operation){
            case 1: System.out.println("= "+(numberOne+numberTwo));
                break;

            case 2: System.out.println("= "+(numberOne-numberTwo));
                break;

            case 3: System.out.println("= "+(numberOne*numberTwo));
                break;

            case 4:
                if(numberTwo==0)
                    System.out.println("Infinity");
                else
                    System.out.println("= "+(numberOne/numberTwo));
                break;

            default:
                System.out.println("You have wrote the wrong number!");
        }
    }
}
