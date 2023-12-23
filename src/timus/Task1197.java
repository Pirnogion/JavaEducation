package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        for (int i = 0; i < n; ++i) {
            String coordinates = in.next();

            int h = getHorizontalPosition(coordinates);
            int v = getVerticalPosition(coordinates);

            int free = 0;
            free += getTopLeft(h, v) ? 1 : 0;
            free += getTopRight(h, v) ? 1 : 0;
            free += getBottomLeft(h, v) ? 1 : 0;
            free += getBottomRight(h, v) ? 1 : 0;
            free += getLeftTop(h, v) ? 1 : 0;
            free += getLeftBottom(h, v) ? 1 : 0;
            free += getRightTop(h, v) ? 1 : 0;
            free += getRightBottom(h, v) ? 1 : 0;

            out.println(free);
        }

        out.flush();
    }

    private static boolean getTopLeft(int h, int v) {
        return h-1 > 0 && v-2 > 0;
    }

    private static boolean getTopRight(int h, int v) {
        return h+1 < 9 && v-2 > 0;
    }

    private static boolean getBottomLeft(int h, int v) {
        return h-1 > 0 && v+2 < 9;
    }

    private static boolean getBottomRight(int h, int v) {
        return h+1 < 9 && v+2 < 9;
    }

    private static boolean getLeftTop(int h, int v) {
        return h-2 > 0 && v-1 > 0;
    }

    private static boolean getLeftBottom(int h, int v) {
        return h-2 > 0 && v+1 < 9;
    }

    private static boolean getRightTop(int h, int v) {
        return h+2 < 9 && v-1 > 0;
    }

    private static boolean getRightBottom(int h, int v) {
        return h+2 < 9 && v+1 < 9;
    }

    private static int getVerticalPosition(String coordinates) {
        return coordinates.charAt(0) - 'a' + 1;
    }

    private static int getHorizontalPosition(String coordinates) {
        return coordinates.charAt(1) - '1' + 1;
    }
}
