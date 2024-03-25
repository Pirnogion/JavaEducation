package lr9;

import java.util.Scanner;

public class Program2 {
    private static Scanner in = new Scanner(System.in);
    private static int[] array = new int[10];

    public static void main(String[] args) {
        System.out.println("Input numbers: ");
        input(0);

        System.out.print("Output array: ");
        output(0);
    }

    public static void input(int len) {
        if (len == 10) return;

        System.out.print("[" + len + "] Input number: ");
        array[len] = in.nextInt();

        input(len + 1);
    }

    public static void output(int len) {
        if (len == 10) return;

        System.out.print(array[len] + " ");

        output(len + 1);
    }
}
