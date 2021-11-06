import java.util.Arrays;

public class ArrayTranspose {

    public static void takeTranspose(int[][] arr) {
        int[][] transposeArr = new int[arr[1].length][arr[0].length - 1];

        for (int i = 0; i < arr[1].length - 1; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transposeArr[j][i] = arr[i][j];
            }
        }

        printArray(transposeArr);
    }


    public static void printArray(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        printArray(array);
        takeTranspose(array);
    }
}
