package timus;

import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task1025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int count = in.nextInt();

        Map<Integer, Integer> tree = new TreeMap<>();
        for (int i = 0; i < count; ++i) {
            tree.compute(in.nextInt(), (k, v) -> (v != null) ? v+1 : 1);
        }

        int answer = 0, visited = 0, limit = count/2 + 1;
        for (Map.Entry<Integer, Integer> group: tree.entrySet()) {
            if (visited >= limit) break;

            int size = group.getKey(), quantity = group.getValue();
            int picked = Math.min(limit-visited, quantity);

            visited += picked;
            answer += (size/2 + 1) * picked;
        }

        out.print(answer);

        out.flush();
        out.close();
        in.close();
    }
}
