import java.util.Scanner;

public class CalculateForGradePointAverage {

    public static void main(String[] args) {

        //@outhor Ahmet Mujde

        //this program run without if-else

        Scanner scanner = new Scanner(System.in);

        double math,turkish,physics,history,music,totalPoint;

        double passPoint=60.0;

        System.out.println("Please enter your math point:");
        math=scanner.nextDouble();

        System.out.println("Please enter your turkish point:");
        turkish=scanner.nextDouble();

        System.out.println("Please enter your physics point:");
        physics=scanner.nextDouble();

        System.out.println("Please enter your history point:");
        history=scanner.nextDouble();

        System.out.println("Please enter your music point:");
        music=scanner.nextDouble();

        totalPoint= (math+turkish+physics+history+music)/5;

        boolean state = passPoint<=totalPoint;

        String result = state ? "You passed the exams" : " You not passed the exams";

        System.out.println(result+"("+totalPoint+")");

    }

}
