import java.util.Scanner;

public class GcdAndLcm {
    // this project  between two number  calculate Greatest common divisor and Least common multiple.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne, numberTwo,gcd=1;

        System.out.print("Please enter first number:");
        numberOne = scanner.nextInt();
        System.out.print("Please enter second number:");
        numberTwo = scanner.nextInt();

        int i=numberOne;
        while(i>=1){
            if ((numberOne%i==0)&&(numberTwo%i==0)){
                gcd=i;
                System.out.println("Greatest common divisor: "+gcd);
                break;
            }
            i--;
        }

        System.out.println("Least common multiple: "+(numberOne*numberTwo)/gcd);
    }
}
