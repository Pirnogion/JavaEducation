package lr4;

import java.util.Random;

public class Program6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrix = new int[3][5];
        int r = random.nextInt(matrix.length+1);
        int c = random.nextInt(matrix[0].length+1);

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
        System.out.format("Removed: [%s, %s]\n", r, c);

        /* ------------------------------------------ */
        int[][] newer = new int[matrix.length-1][matrix[0].length-1];
        for (int i = 0; i < newer.length; ++i) {
            for (int j = 0; j < newer[i].length; ++j) {
                int si = (i >= r) ? 1 : 0;
                int sj = (j >= c) ? 1 : 0;

                int value = matrix[i+si][j+sj];
                newer[i][j] = value;
                System.out.format("%s ", value);
            }
            System.out.println();
        }
    }
}
