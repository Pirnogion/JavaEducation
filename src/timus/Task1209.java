package timus;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringJoiner;

public class Task1209 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();

        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < N; i++) {
            double index = in.nextDouble();
            double reversed = reverse(index-1);

            joiner.add(isInteger(reversed) ? "1" : "0");
        }

        out.print(joiner);

        out.flush();
        out.close();
        in.close();
    }

    public static boolean isInteger(double value) {
        return Math.floor(value) == Math.ceil(value);
    }

    public static double reverse(double sum) {
        return -0.5 + Math.sqrt(0.25 + 2*sum);
    }
}
