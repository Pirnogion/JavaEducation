package lr1;

import java.time.Year;
import java.util.Scanner;

public class Program7 {
    public static final Integer CURRENT_YEAR = Year.now().getValue();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input age: ");
        Integer age = in.nextInt();

        System.out.format("You were born in %s.", CURRENT_YEAR - age);

        in.close();
    }
}
