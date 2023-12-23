package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        out.print(2 * in.nextInt() * in.nextInt() * in.nextInt());
        out.flush();
    }
}
