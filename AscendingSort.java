import java.util.Scanner;

public class AscendingSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numberFirst,numberSecond,numberThird;

        System.out.println("Please enter the fist number");
        numberFirst=scanner.nextDouble();

        System.out.println("Please enter the second number");
        numberSecond=scanner.nextDouble();

        System.out.println("Please enter the third number");
        numberThird=scanner.nextDouble();

        if (numberFirst>numberSecond && numberFirst>numberThird){
            if (numberSecond>numberThird)
                System.out.println(numberThird+"<"+numberSecond+"<"+numberFirst);
            else
                System.out.println(numberSecond+"<"+numberThird+"<"+numberFirst);
        }

        else if (numberSecond>numberFirst && numberSecond>numberThird){
            if (numberFirst>numberThird)
                System.out.println(numberThird+"<"+numberFirst+"<"+numberSecond);
            else
                System.out.println(numberFirst+"<"+numberThird+"<"+numberSecond);

        }
        else{
            if (numberFirst>numberSecond)
                System.out.println(numberSecond+"<"+numberFirst+"<"+numberThird);
            else
                System.out.println(numberFirst+"<"+numberSecond+"<"+numberThird);
        }
    }

}
