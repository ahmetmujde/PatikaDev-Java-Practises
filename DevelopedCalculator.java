import java.util.Scanner;

public class DevelopedCalculator {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;

        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();

        while (i<=counter) {
            System.out.print(i++ + ". Number :");
            number = scan.nextInt();
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You can't enter zero for divisor.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the base value  :");
        int base = scan.nextInt();
        System.out.print("Please enter the exponent value  :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void modular(){
        Scanner scan = new Scanner(System.in);
        int numberOne,numberTwo;

        System.out.println("Please  enter the fist number");
        numberOne=scan.nextInt();

        System.out.println("Please  enter the second number");
        numberTwo=scan.nextInt();

        if (numberOne==0 || numberTwo==0 )
            System.out.println("You can't enter zero. Please try again");
        else
            System.out.println("Result: "+numberOne%numberTwo);
    }

    static  void rectangle(){
        Scanner scan = new Scanner(System.in);

        double shortSide,longSide;

        System.out.println("Please enter the  long side: ");
        longSide=scan.nextDouble();

        System.out.println("Please enter the  short side: ");
        shortSide=scan.nextDouble();

        System.out.println("Area of rectangle: "+(shortSide*longSide)+"\n" +
                "Perimeter of rectangle: "+(shortSide*2+longSide*2));
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Factorial Calculation\n"
                + "7- Modular Calculation \n"
                + "8- Rectangle Area and Perimeter Calculation\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select any number:");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modular();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered a wrong number! Please try again.");
            }
        } while (select != 0);


    }
}