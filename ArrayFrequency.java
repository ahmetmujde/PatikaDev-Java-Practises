import java.util.Arrays;

public class ArrayFrequency {
    public static void findFrequencyArray(int[] arr) {
        int[] repetitiveNumbers = new int[arr.length];
        int[] repetitiveNumbersValue = new int[arr.length];
        Arrays.sort(arr);

        int i = 0;
        while (i < arr.length) {
            int count = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            repetitiveNumbers[i] = arr[i];
            repetitiveNumbersValue[i] = count;

            if (count != 0) {
                i += count;
            } else {
                i++;
            }
        }

        printTwoArray(repetitiveNumbers, repetitiveNumbersValue);

    }

    public static void printTwoArray(int[] arr, int[] arrValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i] + " sayısı " + arrValue[i] + " kere tekrar edildi.");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        findFrequencyArray(arr);
    }
}
