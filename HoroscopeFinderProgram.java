import java.util.Scanner;

public class HoroscopeFinderProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day,month;

        System.out.println("Please enter your born day");
        day=scanner.nextInt();

        System.out.println("Please enter your born month");
        month=scanner.nextInt();

        if((0<day && day<=31) && (0<month && month<=12)){

            if (month==1){
                if (0<day && day<=21)
                    System.out.println("Your horoscope is : Capricorn");

                else
                    System.out.println("Your horoscope is : Aquarius");
            }

            else if (month==2){
                if (0<day && day<=19)
                    System.out.println("Your horoscope is : Aquarius");

                else
                    System.out.println("Your horoscope is : Pisces");
            }

            else if (month==3){

                if (0<day && day<=20)
                    System.out.println("Your horoscope is : Pisces");

                else
                    System.out.println("Your horoscope is : Aries");
            }

            else if (month==4){

                if (0<day && day<=20)
                    System.out.println("Your horoscope is : Aries");

                else
                    System.out.println("Your horoscope is : Taurus");
            }

            else if (month==5){

                if (0<day && day<=22)
                    System.out.println("Your horoscope is : Taurus");

                else
                    System.out.println("Your horoscope is : Gemini");
            }

            else if (month==6){

                if (0<day && day<=22)
                    System.out.println("Your horoscope is : Gemini");

                else
                    System.out.println("Your horoscope is : Cancer ");
            }

            else if (month==7){

                if (0<day && day<=22)
                    System.out.println("Your horoscope is : Cancer");

                else
                    System.out.println("Your horoscope is : Leo");
            }


            else if (month==8){

                if (0<day && day<=22)
                    System.out.println("Your horoscope is : Leo");

                else
                    System.out.println("Your horoscope is : Virgo");
            }

            else if (month==9){

                if (0<day && day<=22)
                    System.out.println("Your horoscope is : Virgo");

                else
                    System.out.println("Your horoscope is : Libra");
            }

            else if (month==10){

                if (0<day && day<=22)
                    System.out.println("Your horoscope is : Libra");

                else
                    System.out.println("Your horoscope is : Scorpio");
            }

            else if (month==11){

                if (0<day && day<=21)
                    System.out.println("Your horoscope is : Scorpio");

                else
                    System.out.println("Your horoscope is : Sagittarius ");
            }

            else{

                if (0<day && day<=21)
                    System.out.println("Your horoscope is : Sagittarius");

                else
                    System.out.println("Your horoscope is : Capricorn");
            }

        }

        else
            System.out.println("Error! You entered day or month incorrectly! ");
    }
}
