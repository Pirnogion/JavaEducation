package lr1;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the name of the current day of the week: ");
        String dayName = in.nextLine();

        System.out.print("Input the name of the current month: ");
        String monthName = in.nextLine();

        System.out.print("Input day number of the month: ");
        Integer dayNumber = in.nextInt();

        System.out.printf("%s %s %s", dayName, dayNumber, monthName);

        in.close();
    }
}
