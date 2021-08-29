package util;

import java.util.Scanner;

public class ScannerUtil {
    public static int getInt(String welcomeText) {
        System.out.println(welcomeText);
        return getInt();
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
