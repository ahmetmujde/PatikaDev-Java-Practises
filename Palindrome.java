public class Palindrome {

    static void isPalindrome(String str) {

        int strLength = str.length();

        String strFirstPart;
        String strLastPart;

        if (strLength % 2 == 0) {
            strFirstPart = str.substring(0, str.length() / 2);
            strLastPart = str.substring((str.length() / 2), strLength);

        } else {

            strFirstPart = str.substring(0, (int) str.length() / 2);
            strLastPart = str.substring((str.length() / 2) + 1, strLength);

        }
        strLastPart = stringReverse(strLastPart);

        if (strFirstPart.equals(strLastPart)) {
            System.out.println(str + " is palindrome ");
        } else {
            System.out.println(str + " is not palindrome ");
        }
    }

    static String stringReverse(String str) {

        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        String reverse = String.valueOf(sbr);

        return reverse;
    }


    public static void main(String[] args) {
        isPalindrome("civic");
        isPalindrome("level");
        isPalindrome("kayak");
        isPalindrome("madam");
    }
}
