import java.util.Scanner;

public class BasicAtmProject {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Please Enter Your Username :");
            userName = input.nextLine();
            System.out.print("Please Enter Your Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to bank of kodluyoruz");
                do {
                    System.out.println("1-Put money into your account\n" +
                            "2-Withdraw cash\n" +
                            "3-On screen\n" +
                            "4-Quit");
                    System.out.print("Please choose the any transaction : ");
                    select = input.nextInt();

                    switch (select) {

                        case 1: { System.out.print("Enter the amount of money: ");
                                    int price = input.nextInt();
                                    balance += price;
                                }
                            break;

                        case 2: {System.out.print("Enter the amount of money: ");
                                    int price = input.nextInt();
                                    if (price > balance) {
                                        System.out.println("Insufficient funds.");
                                    } else {
                                        balance -= price;
                                    }
                                }
                            break;

                        case 3:  System.out.println("Balance : " + balance);
                            break;

                        case 4:
                            System.out.println("See you again.");
                            break;

                        default:
                            System.out.println("Wrong choice ");
                            break;
                    }

                } while (select != 4);
                break;

            } else {
                right--;
                System.out.println("Username error or wrong password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked.Please contact the bank.");
                } else {
                    System.out.println("Remaining entry: " + right);
                }
            }
        }
    }
}
