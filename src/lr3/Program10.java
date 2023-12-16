package lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random random = new Random();

        int n = 100;

        System.out.print("Unsorted: ");
        Integer[] massiv = new Integer[n];
        for (int i = 0; i < n; ++i) {
            massiv[i] = random.nextInt();
            System.out.format("%s ", massiv[i]);
        }

        System.out.print("\nSorted: ");

        Arrays.sort(massiv, Collections.reverseOrder());
        for (int i = 0; i < n; ++i) {
            System.out.format("%s ", massiv[i]);
        }

        in.close();
    }
}
