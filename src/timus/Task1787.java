package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt(); int t = in.nextInt();

        int result = 0;
        for (int i = 0; i < t; ++i) {
            result = Math.max(result + in.nextInt() - k, 0);
        }

        out.print(result);

        out.flush();
    }
}
