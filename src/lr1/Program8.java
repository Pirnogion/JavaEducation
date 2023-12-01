package lr1;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a first number: ");
        Integer a = in.nextInt();

        System.out.print("Input a second number: ");
        Integer b = in.nextInt();

        System.out.format("%s + %s = %s.", a, b, a + b);

        in.close();
    }
}
