package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();

        if (at(1, 4, n)) out.print("few");
        else if (at(5, 9, n)) out.print("several");
        else if (at(10, 19, n)) out.print("pack");
        else if (at(20, 49, n)) out.print("lots");
        else if (at(50, 99, n)) out.print("horde");
        else if (at(100, 249, n)) out.print("throng");
        else if (at(250, 499, n)) out.print("swarm");
        else if (at(500, 999, n)) out.print("zounds");
        else if (n >= 1000) out.print("legion");

        out.flush();
    }

    private static boolean at(int begin, int end, int value) {
        return value >= begin && value <= end;
    }
}
