package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random random = new Random();

        int n = 100;

        int min = Integer.MAX_VALUE;
        int length = 0;
        int[] indexes = new int[n];
        int[] massiv = new int[n];
        for (int i = 0; i < n; ++i) {
            int value = random.nextInt();

            massiv[i] = value;
            if (value < min) {
                min = value;
            }

            System.out.format("%s ", value);
        }

        for (int i = 0; i < n; ++i) {
            if (massiv[i] == min) {
                indexes[length++] = i;
            }
        }

        System.out.format("\nMinimum value: %s; Indexes: ", min);
        for (int i = 0; i < length; ++i) {
            System.out.format("%s ", indexes[i]);
        }

        in.close();
    }
}
