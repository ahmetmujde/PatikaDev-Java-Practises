import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n, int i)
    {

        // Base cases
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        // Check for next divisor
        return isPrime(n, i + 1);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Please enter the any number");
        number=scanner.nextInt();

        if(isPrime(number,2)==false)
            System.out.println(number+" isn't prime number");
        else
            System.out.println(number+" is  prime number");

    }
}
