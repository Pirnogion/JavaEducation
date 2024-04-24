package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();

        if (N >= 0 && N < 10) {
            out.print( (N == 0) ? 10 : N );
        } else {
            StringBuilder answer = new StringBuilder();
            for (int i = 9; i >= 2; --i) {
                while (N%i == 0) {
                    answer.append(i);
                    N = N/i;
                }
            }

            out.print( N != 1 ? -1 : answer.reverse() );
        }

        out.flush();
        out.close();
        in.close();
    }
}