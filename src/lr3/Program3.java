package lr3;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter N: ");

        int n = in.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0; i < n; ++i) {
            b += a + (a = b)*0;

            System.out.print(a);
            System.out.print(" ");
        }

        System.out.println();

        int c = 0;
        int d = 1;
        int i = 0;
        do {
            d += c + (c = d)*0;

            System.out.print(c);
            System.out.print(" ");
        } while (++i < n);

        in.close();
    }
}
