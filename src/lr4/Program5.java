package lr4;

import java.util.Random;

public class Program5 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrix = new int[3][5];

        /* ------------------------------------------ */
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                int value = random.nextInt();
                matrix[i][j] = value;
                System.out.format("%s ", value);
            }
            System.out.println();
        }

        System.out.println();

        /* ------------------------------------------ */
        int[][] newer = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < newer.length; ++i) {
            for (int j = 0; j < newer[i].length; ++j) {
                int value = matrix[j][i];
                newer[i][j] = value;
                System.out.format("%s ", value);
            }
            System.out.println();
        }
    }
}
