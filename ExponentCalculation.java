import java.util.Scanner;

public class ExponentCalculation {


    public static int power(int base,int exponent){

        int result=1;

        if (exponent>0)
            return  result *= base*power(base,exponent-1);

        else
            return result;

    }

    public static  void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the base value  :");
        int numberOne = scanner.nextInt();
        System.out.print("Please enter the exponent value  :");
        int numberTwo = scanner.nextInt();

        System.out.println(power(numberOne,numberTwo));

    }
}
