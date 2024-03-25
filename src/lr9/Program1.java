package lr9;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = in.nextInt();

        System.out.print("Output: ");
        d2b(number);
    }

    public static int d2b(int n) {
        if (n == 0) return 0;
        int value = d2b(n / 2);
        System.out.print(n % 2);
        return value;
    }
}
