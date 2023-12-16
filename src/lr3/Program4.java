package lr3;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vvedite 1 chislo: ");
        int a = in.nextInt();

        System.out.print("Vvedite 2 chislo: ");
        int b = in.nextInt();

        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }

        for (int t = a; t <= b; ++t) {
            System.out.print(t);
            System.out.print(" ");
        }

        System.out.println();

        do {
            System.out.print(a);
            System.out.print(" ");
        } while (++a <= b);

        in.close();
    }
}
