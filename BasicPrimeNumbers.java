import java.util.Scanner;
public class BasicPrimeNumbers {
    public  static  void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        for (int i=2; i<=100; i++){
            boolean state=true;

            for (int j=2; j<i; j++){
                if (i%j==0){
                    state=false;
                    break;
                }

            }

            if (state==true)
                System.out.print(i + " ");

        }

    }
}
