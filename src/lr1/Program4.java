package lr1;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the name of a month: ");
        String monthName = in.nextLine();

        System.out.print("Input days in the month: ");
        Integer days = in.nextInt();

        System.out.printf("%s have %s days.", monthName, days);

        in.close();
    }
}
