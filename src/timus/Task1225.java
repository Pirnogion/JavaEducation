package timus;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1225 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long n = in.nextLong();

        long value1 = 2, value2 = 2;
        for (long i = 2; i < n; ++i) {
            value2 = value1 + value2;
            value1 = value2 - value1;
        }

        out.print(value2);

        out.flush();
        out.close();
        in.close();
    }
}
