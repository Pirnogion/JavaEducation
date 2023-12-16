package lr3;

import java.util.Random;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random random = new Random();

        System.out.print("Enter N: ");
        int n = in.nextInt();

        System.out.print("Array: ");

        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = random.nextInt();
        }

        int length = 0;
        int[] values = new int[n];

        for (int value: array) {
            if (value % 5 == 2 || value % 3 == 1) {
                sum += value;
                values[length++] = value;
                System.out.format("[%s] ", value);
            } else {
                System.out.format("%s ", value);
            }
        }

        System.out.print("\nSum: ");
        for (int i = 0; i < length; ++i) {
            System.out.format("%s + ", values[i]);
        }

        System.out.format("0 = %s.", sum);

        System.out.print("\nArray: ");
        length = 0;
        sum = 0;
        int dasml = 0;
        while (dasml < n) {
            int value = array[dasml++];
            if (value % 5 == 2 || value % 3 == 1) {
                sum += value;
                values[length++] = value;
                System.out.format("[%s] ", value);
            } else {
                System.out.format("%s ", value);
            }
        }

        System.out.print("\nSum: ");
        for (int i = 0; i < length; ++i) {
            System.out.format("%s + ", values[i]);
        }

        System.out.format("0 = %s.", sum);

        in.close();
    }
}
