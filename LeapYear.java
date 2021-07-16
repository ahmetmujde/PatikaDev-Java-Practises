import java.util.Scanner;

public class LeapYear {
    public  static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.println("Please enter the any year: ");
        year=scanner.nextInt();

        if (year%4==0)
            System.out.println(year+" is a leap year ");
        else
            System.out.println(year+" isn't a leap year ");
    }
}
