import java.util.Scanner;
import java.math.*;
public class CalculateTheAreaOfTriangle {
    public static void main (String[] args){

        //u is helpful variable for perimeter of triangle

        double a,b,c,u,area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the a is height:");
        a= scanner.nextDouble();

        System.out.println("Please enter the b is height:");
        b= scanner.nextDouble();

        System.out.println("Please enter the c is height:");
        c= scanner.nextDouble();

        u=(a+b+c)/2;

        area = u*(u-a)*(u-b)*(u-c);

        area=Math.sqrt(area);


        System.out.println("Perimeter of the triangle: "+u*2);

        System.out.println("Area of the triangle: "+area);
    }
}
