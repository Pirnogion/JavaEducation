package timus;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1149 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        out.print(S(in.nextInt()));

        out.flush();
        out.close();
        in.close();
    }

    public static String S(int n) {
        StringBuilder builder = new StringBuilder();

        builder.append(repeat('(', n-1));
        for (int i = 1; i < n; i++) {
            builder.append(A(i));
            builder.append('+');
            builder.append(n-i+1);
            builder.append(')');
        }

        builder.append(A(n));
        builder.append('+');
        builder.append(1);

        return builder.toString();
    }

    public static String A(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n; i++) {
            builder.append("sin(");
            builder.append(i);
            builder.append((i%2 == 0) ? '+' : '-');
        }

        builder.append("sin(");
        builder.append(n);
        builder.append(repeat(')', n));

        return builder.toString();
    }

    public static String repeat(char character, int repeats) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < repeats; i++) {
            builder.append(character);
        }

        return builder.toString();
    }
}
