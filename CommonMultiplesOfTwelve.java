import java.util.Scanner;

public class CommonMultiplesOfTwelve {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number,	norm=0,count=0;

        System.out.println("Please input the any number");
        number=scanner.nextInt();

        System.out.println("Common multiples of twelve");
        for (int i=0; i<=number; i++){
            if ((i%3==0) && (i%4==0)){
                System.out.print(i+", ");
                norm+=i;
                count++;
            }
        }

        System.out.println("\nNorm is :"+(norm/count));

    }
}
