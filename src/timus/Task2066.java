package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt();

        int result = Integer.MAX_VALUE;

        result = Math.min(a + b + c, result);
        result = Math.min(a + b - c, result);
        result = Math.min(a + b * c, result);
        result = Math.min(a - b + c, result);
        result = Math.min(a - b - c, result);
        result = Math.min(a - b * c, result);
        result = Math.min(a * b + c, result);
        result = Math.min(a * b - c, result);
        result = Math.min(a * b * c, result);

        out.print(result);
        out.flush();
    }
}
