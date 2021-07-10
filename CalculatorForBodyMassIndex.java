import java.util.Scanner;

//@outhor Ahmet Mujde

public class CalculatorForBodyMassIndex {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double height,kilo;

        System.out.println("Please enter the your height(for metre): ");
        height=scanner.nextDouble();

        System.out.println("Please enter the your kilo(for kilo): ");
        kilo=scanner.nextDouble();

        System.out.println("Your body mass index: "+kilo/(height*height));
    }

}
