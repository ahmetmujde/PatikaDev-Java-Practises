import java.util.Scanner;

public class get_data_from_user {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Your name is: "+name);

    }
}