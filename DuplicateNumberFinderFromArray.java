public class DuplicateNumberFinderFromArray {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }

        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 1, 6, 2, 3, 9, 9};
        int[] duplicate = new int[arr.length];

        int starIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    if ((!isFind(duplicate, arr[i]))) {
                        duplicate[starIndex++] = arr[i];
                    }
                    break;
                }
            }
        }

        printArray(duplicate);
    }
}
