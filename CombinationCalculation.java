import java.util.Scanner;

public class CombinationCalculation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n,r,factorialN=1,factorialR=1,factorialN_R=1;

        System.out.println("Please enter the n value of combination: ");
        n=scanner.nextInt();

        System.out.println("Please enter the r value of combination: ");
        r=scanner.nextInt();

        for (int i=1; i<=n; i++)
            factorialN*=i;

        for (int j=1; j<=r; j++)
            factorialR*=j;

        for (int m=1; m<=(n-r); m++)
            factorialN_R*=m;


        System.out.println("C(n,r)="+factorialN/(factorialR*factorialN_R));
    }
}
