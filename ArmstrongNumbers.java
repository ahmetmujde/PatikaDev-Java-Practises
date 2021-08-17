import java.util.Scanner;
import static java.lang.Math.sqrt;

public class ArmstrongNumbers {
    public static void main(String[] args) {


        /* Chapter one
            This chapter wants a value from user and program find the armstrong number
        */

        Scanner scanner = new Scanner(System.in);

        int number,length=0,sum=0;
        System.out.println("Please enter the any number... ");
        number=scanner.nextInt();

        length= Integer.toString(number).length();

        for (int i=0; i<length; i++){
            String numberOfDigit;
            numberOfDigit=Integer.toString(number).substring(i,i+1);
            sum+=Math.pow(Integer.parseInt(numberOfDigit),length);
        }

        if (number==sum)
            System.out.println(number+" is Armstrong number ");
        else
            System.out.println(number+" isn't Armstrong number ");


        /*
        Chapter two
            Primary homework. This program adds the number of digits of any number.

        Scanner scanner = new Scanner(System.in);

        int number,length=0,sum=0;
        System.out.println("Please enter the any number... ");
        number=scanner.nextInt();

        length= Integer.toString(number).length();

        for (int i=0; i<length; i++){
            String numberOfDigit;
            numberOfDigit=Integer.toString(number).substring(i,i+1);
            sum+=Integer.parseInt(numberOfDigit);
        }

        System.out.println("Sum of the digits of the number "+number+"= "+sum);

         */

        /*Last Chapter
          Actually this part is the homework of the video and this program finds armstrong numbers
          between 0 and 999.

        for (int i=0; i<=999; i++){

            int length= Integer.toString(i).length();
            int sum=0;

            for (int j=0; j<length; j++){
                String numberOfDigit;
                numberOfDigit=Integer.toString(i).substring(j,j+1);
                sum+=Math.pow(Integer.parseInt(numberOfDigit),length);
            }

            if (i==sum)
                System.out.println(i);
        }

         */
    }
}
