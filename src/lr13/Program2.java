package lr13;

import java.util.*;

public class Program2 {
    public static final int[][] MATRIX = {
            {0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0},
    };

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        try {
            var columnIndex = readInteger(scanner);
            var column = getColumn(MATRIX, columnIndex);

            System.out.format("Значения колонки #%s матрицы: %s.\n", columnIndex, Arrays.toString(column));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Колонки с таким индексом не существует.");
        } catch (Exception exception) {
            System.out.println("Произошла ошибка при выполнеии программы!");
            exception.printStackTrace();
        }
    }

    public static int readInteger(Scanner scanner) {
        while (true) {
            System.out.print("Введите индекс колонки матрицы: ");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Разрешено вводить только целые неотрицательные числа!");
            }
        }
    }

    public static int[] getColumn(int[][] matrix, int index) {
        var column = new int[matrix.length];
        for (int i = 0; i < matrix.length; ++i) {
            column[i] = matrix[i][index];
        }

        return column;
    }
}
