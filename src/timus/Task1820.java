package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        double n = in.nextInt();
        double k = in.nextInt();

        out.print(
            (n > k) ? (int)Math.ceil(2*n/k) : 2
        );

        out.flush();
    }
}
