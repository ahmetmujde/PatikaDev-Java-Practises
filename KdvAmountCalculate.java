import java.util.Scanner;

public class KdvAmountCalculate {

    public static void main(String[] args){
        //@outhor Ahmet Mujde

        Scanner scanner = new Scanner(System.in);

        double product_Price;

        System.out.println("Please enter the product price");
        product_Price = scanner.nextDouble();

        if (0<product_Price) {
            if(product_Price <= 1000) {
                product_Price += product_Price * 0.18;
                System.out.println("Total Price: " + product_Price);
            }
            else {
                product_Price += product_Price * 0.08;
                System.out.println("Total Price: " + product_Price);
            }
        }

        else {
            System.out.println("The product price must not be a negative value");
        }

    }

}
