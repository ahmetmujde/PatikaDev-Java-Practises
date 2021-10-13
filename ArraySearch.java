import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        /*Program to find the nearest number smaller than the entered number and
        the nearest element number in the array*/

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};

        int number = 0;
        int closestBiggestNumber = 0;
        int closestSmallestNumber = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the any number: ");

        number = scanner.nextInt();

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        if ((arr[0] <= number) && (number <= arr[arr.length - 1])) {
            for (int i = 0; i < arr.length; i++) {
                if (!(arr[i] < number)) {
                    closestBiggestNumber = arr[i];
                    closestSmallestNumber = arr[i - 1];
                    break;
                }
            }
            System.out.println("closest biggest number from entered number: " +
                    closestBiggestNumber);
            System.out.println("closest smallest number from entered number: " +
                    closestSmallestNumber);
        } else {
            System.out.println("Number is limit outside  ");
        }


    }
}
