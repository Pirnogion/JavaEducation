package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int password1 = in.nextInt();
        int password2 = in.nextInt();

        out.print(
            (password1 % 2 == 1 && password2 % 2 == 0) ? "no" : "yes"
        );

        out.flush();
    }
}
