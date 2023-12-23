package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        float n = in.nextFloat();
        float time = 1f + (12f-n) * .75f;

        out.print(
            (time <= 5f) ? "YES" : "NO"
        );

        out.flush();
    }

    private static boolean at(int begin, int end, int value) {
        return value >= begin && value <= end;
    }
}
