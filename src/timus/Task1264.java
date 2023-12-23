package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int M = in.nextInt();

        out.print(N * (M+1));

        out.flush();
    }
}
