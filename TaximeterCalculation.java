import java.util.Scanner;

public class TaximeterCalculation {
    public static void main(String[] args){

        double km,perKm=2.20,total,startPrice=10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the total kilometres: ");
        km=scanner.nextDouble();

        total=(km*perKm)+startPrice;

        if(total<20){
            total=20;
            System.out.println("Your total price: "+Double.toString(total).substring(0,5));
        }
        else{
            System.out.println("Your total price: "+Double.toString(total).substring(0,5));
        }
    }
}
