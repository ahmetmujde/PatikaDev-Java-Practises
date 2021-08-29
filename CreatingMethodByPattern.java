import util.ScannerUtil;

public class CreatingMethodByPattern {

    private static int selectedNumber;
    private static boolean isSubtraction = true;
    private final static int OPERATION_NUMBER = 5;

    public static void main(String[] Args) {
        selectedNumber = getNumberFromUser();
        printNumber(selectedNumber);
        recPatter(selectedNumber);
    }

    private static int getNumberFromUser() {
        return ScannerUtil.getInt("Please enter the any number");
    }

    private static void printNumber(int number) {
        System.out.print(number + " ");
    }

    private static int recPatter(int variable) {
        int currentNumber = getCalculatedNumber(variable);
        reDefineOperation(currentNumber);
        printNumber(currentNumber);

        if (currentNumber == selectedNumber) {
            return currentNumber;
        }

        return recPatter(currentNumber);
    }

    private static int getCalculatedNumber(int variable) {
        if (isSubtraction) {
            return variable - OPERATION_NUMBER;
        }

        return variable + OPERATION_NUMBER;
    }

    private static void reDefineOperation(int currentNumber) {
        if (currentNumber <= 0) {
            isSubtraction = !isSubtraction;
        }
    }
}
