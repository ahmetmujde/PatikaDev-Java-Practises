import java.util.Scanner;

public class LessonPassSystem {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double math,turkish,physics,history,music,totalPoint,passPoint=55.0;

        int totalLesson=5;

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

        if(math<0 || math>100){
            math=0;
            --totalLesson;
        }

        if(turkish<0 || turkish>100){
            turkish=0;
            --totalLesson;
        }

        if(physics<0 || physics>100){
            physics=0;
            --totalLesson;
        }

        if(history<0 || history>100){
            history=0;
            --totalLesson;
        }

        if(music<0 || music>100){
            music=0;
            --totalLesson;
        }

        if (totalLesson>0){

            totalPoint= (math+turkish+physics+history+music)/totalLesson;

            if(passPoint<=totalPoint){
                System.out.println("Congratulations!You passed the lessons...\n Your total point: "+totalPoint);
            }
            else{
                System.out.println("You not passed the lessons...\n Your total point: "+totalPoint);
            }
        }

        else
            System.out.println("Your point not calculate because all lessons are out of range");
    }
}
