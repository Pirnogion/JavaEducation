package lr13;

import java.util.*;

public class Program1 {
    public static final int NUMBERS = 5;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.format("Введите %s целых чисел: \n", NUMBERS);
        try {
            var average = readIntegers(scanner, NUMBERS).stream()
                    .filter(value -> value > 0)
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            System.out.format("Среднее арфметическое: %s.\n", average);
        } catch (Exception exception) {
            System.out.println("Произошла ошибка при выполнеии программы!");
            exception.printStackTrace();
        }
    }

    public static List<Integer> readIntegers(Scanner scanner, int size) throws NoSuchElementException {
        var hasPositive = false;

        var list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; ++i) {
            var isOk = false;
            while (!isOk) {
                System.out.format(" [%s] ", i+1);

                try {
                    var integer = Integer.parseInt(scanner.nextLine());
                    if (integer > 0) hasPositive = true;
                    isOk = list.add(integer);
                } catch (NumberFormatException exception) {
                    System.out.println("Разрешено вводить только целые числа!");
                }
            }
        }

        if (!hasPositive) throw new NoSuchElementException("Отсутствуют положительные значения");

        return list;
    }
}
