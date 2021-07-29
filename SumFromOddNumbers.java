import java.util.Scanner;

public class SumFromOddNumbers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int numbers,sum=0;

        do {
            System.out.println("Please enter the any number");
            numbers= scanner.nextInt();

            if (numbers%2==1)
                sum+=numbers;
        }
        while (numbers>0);

        System.out.println("collected numbers :"+sum);



        //this chapter is homework
        /*
        Scanner scanner = new Scanner(System.in);

        int numbers,sum=0;
        System.out.println("Please enter any number but if you write odd number program will close.");

        do {
            System.out.println("Please enter any number:");
            numbers=scanner.nextInt();

            if (numbers%4==0)
                sum+=numbers;

        } while (numbers%2==0);

        System.out.println(sum);

         */

    }
}
