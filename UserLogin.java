import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName,password="12345",inputPassword;

        byte answerReset;

        System.out.println("Please enter the username: ");
        userName = scanner.nextLine();

        System.out.println("Please enter the password: ");
        inputPassword = scanner.nextLine();

        if (userName.equals("jack") && inputPassword.equals(password))
            System.out.println("Logon successful");

        else {
            System.out.println("Logon failed\n Can you reset the your password? (0:No/1:Yes)");
            answerReset= scanner.nextByte();

            if (answerReset==1){

                String newPassword;

                System.out.println("Please enter the new password: ");
                newPassword = scanner.next();

                if (newPassword.equals(password))
                    System.out.println("Password not created, please other create password");

                else{
                    System.out.println("Successful! New password created");
                }
            }

            else{
                System.out.println("Logon failed, Please try again");
            }
        }

    }
}
