package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int invitations = in.nextInt();

        int peoples = 2 + invitations;
        for (int friend = 0; friend < invitations; ++friend) {
            String name = in.next();
            if (name.endsWith("+one")) {
                peoples += 1;
            }
        }

        int price = peoples * 100;
        if (peoples == 13) {
            price += 100;
        }

        out.print(price);
        out.flush();
    }
}
