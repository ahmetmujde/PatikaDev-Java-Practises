import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int base,exponent,result=1;

        System.out.println("Please enter the base number");
        base=scanner.nextInt();

        System.out.println("Please enter the exponent number");
        exponent=scanner.nextInt();

        if (exponent>-1){
            for (int i=1; i<=exponent; i++)
                result*=base;

            System.out.println(result);
        }
        else
            System.out.println("Exponent cannot be negative  ");

    }
}
