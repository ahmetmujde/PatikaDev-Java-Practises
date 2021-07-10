import java.util.Scanner;

public class GreengrocerCashierProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pear,apple,tomato,banana,aubergine;

        System.out.println("***Welcome to Greengrocer shop***\nPear:\t\t$2,14\nApple:\t\t$3,67\nTomato:\t\t$1,11\n" +
                "Banana:\t\t$0,95\nAubergine:\t$5,00\n");

        System.out.println("How many kilos of pear:");
        pear=scanner.nextDouble()*2.14;

        System.out.println("How many kilos of apple:");
        apple=scanner.nextDouble()*3.67;

        System.out.println("How many kilos of tomato:");
        tomato=scanner.nextDouble()*1.11;

        System.out.println("How many kilos of banana:");
        banana=scanner.nextDouble()*0.95;


        System.out.println("How many kilos of aubergine:");
        aubergine=scanner.nextDouble()*5;

        System.out.println("Total Fixed Cost: $"+(pear+apple+tomato+banana+aubergine));


    }

}
