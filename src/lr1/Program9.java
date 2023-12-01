package lr1;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input any number: ");
        Integer n = in.nextInt();

        System.out.format("%s, %s, %s, %s.", n-1, n, n+1, 9*n*n);

        in.close();
    }
}
