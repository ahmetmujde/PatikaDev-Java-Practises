import java.util.Scanner;

public class FlightTicketCalculation {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double km,flightType,normalCost,totalCost = 0,discountCost=0;
        int age;

        System.out.println("Please enter kilometers between two places: ");
        km=scanner.nextDouble();

        System.out.println("Please enter the your age: ");
        age=scanner.nextInt();

        System.out.println("Please choose the your type of flight: ");
        flightType=scanner.nextDouble();

        if ((km>0) && (flightType==1 || flightType==2) && age>-1) {

            normalCost=km*0.10;

            if(age < 12)
                discountCost= normalCost - (normalCost*0.5);

            else if ((12 <= age) && (age <= 24))
                discountCost= normalCost - (normalCost*0.1);

            else if(65<age)
                discountCost= normalCost - (normalCost*0.3);

            else
                totalCost= normalCost;


            if (flightType==2){
                totalCost=discountCost-(discountCost*0.2);
                totalCost*=2;
            }

            System.out.println("Total cost:"+totalCost);
        }

        else{
            System.out.println("The value you entered is wrong");
        }

    }

}
