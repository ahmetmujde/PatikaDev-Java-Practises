import java.util.Scanner;

public class MinimumAndMaximumNumbers {
    public static void main(String[] args){
        //program that finds the minimum and maximum numbers entered

        Scanner scanner = new Scanner(System.in);

        int totalNumber,number=0,maximumNumber=0,minimumNumber=0;
        //is the total number of numbers entered

        System.out.println("How many numbers will you enter?");
        totalNumber=scanner.nextInt();

        for (int i=0; i<totalNumber; i++){
            System.out.println("Enter the "+(i+1)+". number");
            number=scanner.nextInt();

            if (maximumNumber<=number)
                maximumNumber=number;

            if (minimumNumber>=number)
                minimumNumber=number;

        }

        System.out.println("Maximum number: "+maximumNumber+
                "\nMinimum number: "+ minimumNumber);

    }

}
