import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;

        double sum=0;

        System.out.println("Please enter the any number");
        number=scanner.nextInt();

        for (double i=1; i<=number; i++){
            sum += 1/i;
        }

        System.out.println(sum);

    }

}
