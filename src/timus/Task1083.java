package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1083 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt(), k = in.next().length();
        int rest = n%k, base = (rest != 0) ? rest : k;

        int ducktorial = 1;
        for (int i = base; i <= n; i += k) {
            ducktorial *= i;
        }

        out.print(ducktorial);

        out.flush();
        out.close();
        in.close();
    }
}
