package lr4;

public class Program4 {
    public static void main(String[] args) {
        char[][] matrix = {
            {'2'},
            {'2', '2'},
            {'2', '2', '2'},
            {'2', '2', '2', '2'},
            {'2', '2', '2', '2', '2'},
            {'2', '2', '2', '2', '2', '2'},
            {'2', '2', '2', '2', '2', '2', '2'},
            {'2', '2', '2', '2', '2', '2', '2', '2'},
            {'2', '2', '2', '2', '2', '2', '2', '2', '2'},
            {'2', '2', '2', '2', '2', '2', '2', '2', '2', '2'},
            {'2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2'},
        };

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
