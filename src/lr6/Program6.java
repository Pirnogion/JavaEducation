package lr6;

import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        int[] copied1 = ArrayCopier.copy(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 0);
        int[] copied2 = ArrayCopier.copy(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 5);
        int[] copied3 = ArrayCopier.copy(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 100);

        ArrayCopier.print(copied1);
        ArrayCopier.print(copied2);
        ArrayCopier.print(copied3);
    }

    static class ArrayCopier {
        public static int[] copy(int[] values, int value) {
            return Arrays.copyOf(values, Math.min(values.length, value));
        }

        public static void print(int[] copied) {
            System.out.format("%s elements copied:", copied.length);
            for (int value: copied) {
                System.out.format(" %s", value);
            }
            System.out.println(";");
        }
    }
}

