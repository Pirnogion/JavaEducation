package lr1;

import java.time.Year;
import java.util.Scanner;

public class Program5 {
    public static final Integer CURRENT_YEAR = Year.now().getValue();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year of birth: ");
        Integer year = in.nextInt();

        System.out.format("You are %s years old.", CURRENT_YEAR - year);

        in.close();
    }
}
