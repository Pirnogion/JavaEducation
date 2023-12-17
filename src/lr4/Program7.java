package lr4;

public class Program7 {
    public static void main(String[] args) {
        int rows = 6; int cols = 6;
        int[][] matrix = new int[rows][cols];

        int dir = 0; // 0 - right, 1 - down, 2 - left, 3 - top
        int row = 0; int col = 0;
        for (int i = 1; i <= rows*cols; ++i) {
            matrix[row][col] = i;

            if (dir == 0) {
                if (col+1 == cols || matrix[row][col+1] != 0) {
                    dir = 1; row += 1;
                } else {
                    col += 1;
                }
            } else if (dir == 1) {
                if (row+1 == rows || matrix[row+1][col] != 0) {
                    dir = 2; col -= 1;
                } else {
                    row += 1;
                }
            } else if (dir == 2) {
                if (col-1 == -1 || matrix[row][col-1] != 0) {
                    dir = 3; row -= 1;
                } else {
                    col -= 1;
                }
            } else if (dir == 3) {
                if (row-1 == rows || matrix[row-1][col] != 0) {
                    dir = 0; col += 1;
                } else {
                    row -= 1;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.format("%s\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
