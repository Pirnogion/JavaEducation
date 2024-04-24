package timus;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Task1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), m = in.nextInt(), y = in.nextInt();
        BigInteger bm = BigInteger.valueOf(m), by = BigInteger.valueOf(y);

        boolean noAnswer = true;
        for (int x = 0; x < m; ++x) {
            boolean match = BigInteger.valueOf(x).pow(n).mod(bm).equals(by);
            if (match) {
                if (noAnswer) noAnswer = false; else out.print(' ');
                out.print(x);
            }
        }

        if (noAnswer) out.print(-1);

        out.flush();
        out.close();
        in.close();
    }
}
