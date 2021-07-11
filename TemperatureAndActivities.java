import java.util.Scanner;

public class TemperatureAndActivities {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double centigrade;

        System.out.println("Please enter the temperature centigrade");
        centigrade = scanner.nextDouble();

        if (centigrade<5)
            System.out.println("you should go skiing");

        else if ((5 <= centigrade) && (centigrade <15))
            System.out.println("you should go watch cinema");

        else if ((15 <= centigrade) && (centigrade <25))
            System.out.println("you should go on a picnic");
        else
            System.out.println("you should go swim");
    }
}
