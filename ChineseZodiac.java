import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int bornYear,remainder;

        System.out.println("Please enter your born year : ");
        bornYear=scanner.nextInt();

        if (bornYear>-1){

            remainder=bornYear%12;

            switch (remainder) {

                case 0:System.out.println("Your Chinese zodiac: Monkey");
                    break;

                case 1:System.out.println("Your Chinese zodiac: Rooster");
                    break;

                case 2:System.out.println("Your Chinese zodiac: Dog");
                    break;

                case 3:System.out.println("Your Chinese zodiac: Pork");
                    break;

                case 4:System.out.println("Your Chinese zodiac: Mouse");
                    break;

                case 5:System.out.println("Your Chinese zodiac: Bull");
                    break;

                case 6:System.out.println("Your Chinese zodiac: Tiger");
                    break;

                case 7:System.out.println("Your Chinese zodiac: Rabbit");
                    break;

                case 8:System.out.println("Your Chinese zodiac: Dragon");
                    break;

                case 9:System.out.println("Your Chinese zodiac: Snake");
                    break;

                case 10:System.out.println("Your Chinese zodiac: Horse");
                    break;

                default:System.out.println("Your Chinese zodiac: Sheep");
            }
        }
        else
            System.out.println("The value you entered is wrong");




    }
}
