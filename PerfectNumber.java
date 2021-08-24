import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number=0,sum=0;

        System.out.println("Please enter the any number");
        number=scanner.nextInt();

        for (int i=1; i<number; i++){
            if (number%i==0)
                sum+=i;
        }

        if (sum==number)
            System.out.println(number+" is a perfect number.");
        else
            System.out.println(number+" isn't a perfect number.");

    }
}
