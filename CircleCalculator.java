import java.util.Scanner;

//@outhor Ahmet Mujde

public class CircleCalculator {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double r,a;
        final double pi = 3.14;

        System.out.println("Please enter the radius of circle (r): ");
        r=scanner.nextDouble();

        System.out.println("Please enter the center angle of the circle segment (a): ");
        a=scanner.nextDouble();

        scanner.close();

        System.out.println("Area of circle:"+(pi*r*r));

        System.out.println("Perimeter of circle:"+(2*pi*r));

        System.out.println("Area of part circle:"+(pi*(r*r)*a)/360);

    }
}
