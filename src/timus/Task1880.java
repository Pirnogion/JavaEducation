package timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Task1880 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int aLength = in.nextInt(); // Первый участник
        HashSet<Integer> a = new HashSet<Integer>(aLength);
        for (int j = 0; j < aLength; ++j) {
            a.add(in.nextInt());
        }

        int bLength = in.nextInt();  // Второй участник
        HashSet<Integer> b = new HashSet<Integer>(bLength);
        for (int j = 0; j < bLength; ++j) {
            b.add(in.nextInt());
        }

        int cLength = in.nextInt();  // Третий участник
        HashSet<Integer> c = new HashSet<Integer>(cLength);
        for (int j = 0; j < cLength; ++j) {
            c.add(in.nextInt());
        }

        HashSet<Integer> r = new HashSet<Integer>(aLength+bLength+cLength);  // Все уникальные числа
        r.addAll(a); r.addAll(b); r.addAll(c);

        int quantity = 0;
        for (int v: r) {
            quantity += a.contains(v) && b.contains(v) && c.contains(v) ? 1 : 0;
        }

        out.print(quantity);

        out.flush();
    }
}
