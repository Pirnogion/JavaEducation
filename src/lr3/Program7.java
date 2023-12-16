package lr3;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 10;

        char[] stroka = new char[n];
        for (int i = 0; i < n; ++i) {
            stroka[i] = (char)(97+i+i);
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(stroka[i]);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = n-1; i >= 0; --i) {
            System.out.print(stroka[i]);
            System.out.print(" ");
        }

        in.close();
    }
}
