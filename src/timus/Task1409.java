package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int harry = in.nextInt();
        int larry = in.nextInt();

        out.format("%s %s", larry-1, harry-1);
        out.flush();
    }
}
