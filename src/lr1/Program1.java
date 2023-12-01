package lr1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input last name: ");
        String lastName = in.nextLine();

        System.out.print("Input first name: ");
        String firstName = in.nextLine();

        System.out.print("Input middle name: ");
        String middleName = in.nextLine();

        System.out.printf("Hello <%s, %s, %s>", lastName, firstName, middleName);

        in.close();
    }
}
