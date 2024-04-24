package timus;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1263 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int candidates = in.nextInt();
        int electorate = in.nextInt();

        int[] votes = new int[candidates];
        for (int i = 0; i < electorate; i++) {
            int candidate = in.nextInt();
            votes[candidate-1] += 100;
        }

        for (int i = 0; i < votes.length; i++) {
            out.format("%.2f%%\n", (double)votes[i] / (double)electorate);
        }

        out.flush();
        out.close();
        in.close();
    }
}
