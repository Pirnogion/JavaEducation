package timus.other;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1225Research {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int total = 0;

        int n = 9;
        for (int i = 0; i < Math.pow(3, n); i++) {
            String combination = String.format("%1$" + n + "s", Integer.toString(i, 3)).replace(' ', '0');
            if (validate(combination)) {
                total += 1;
                System.out.println(combination.replace('0', 'W').replace('1', 'R').replace('2', 'B'));
            }
        }

        System.out.println("Total: " + total);

        out.flush();
        out.close();
        in.close();
    }

    public static boolean validate(String combination) {
        if (combination.charAt(combination.length()-1) == '2') return false;

        int state = -1;
        for (int i = 0; i < combination.length(); i++) {
            switch (combination.charAt(i)) {
                case '0': if (state == -1 || state == 1) state = 0; else if (state == 3) state = 0; else if (state == 0 || state == 2) return false; break;
                case '1': if (state == -1 || state == 0) state = 1; else if (state == 2) state = 1; else if (state == 1 || state == 3) return false; break;
                case '2': if (state == 0) state = 2; else if (state == 1) state = 3; else if (state == -1 || state == 2 || state == 3) return false; break;
            }
        }

        return true;
    }
}
