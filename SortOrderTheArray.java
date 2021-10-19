import java.util.Scanner;

public class SortOrderTheArray {

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void sortingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temporal = arr[i];
            arr[i] = arr[min];
            arr[min] = temporal;
        }

        System.out.println("\n\nSort order the arr");
        printArray(arr);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the array length: ");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Please enter the " + (i + 1) + ". element: ");
            arr[i] = scanner.nextInt();
        }

        if (arr.length > 0) {
            System.out.println("Your entered a array");
            printArray(arr);
            sortingArray(arr);
        }
    }
}
