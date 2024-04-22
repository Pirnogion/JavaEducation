package lr13;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program3 {
    public static final int NUMBERS = 5;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.format("Введите %s целых чисел: \n", NUMBERS);
        try {
            var sum = 0;
            for (var value: readBytes(scanner, NUMBERS)) {
                var result = sum+value;
                if (result < -128 || result > 127) {
                    throw new ArithmeticException("Выход за предел диапазона [-128 .. 127]");
                }

                sum = result;
            }

            System.out.format("Сумма: %s.\n", sum);
        } catch (Exception exception) {
            System.out.println("Произошла ошибка при выполнеии программы!");
            exception.printStackTrace();
        }
    }

    public static List<Byte> readBytes(Scanner scanner, int size) throws NoSuchElementException {
        var list = new ArrayList<Byte>(size);
        for (int i = 0; i < size; ++i) {
            var isOk = false;
            while (!isOk) {
                System.out.format(" [%s] ", i+1);

                try {
                    var _byte = Byte.parseByte(scanner.nextLine());
                    isOk = list.add(_byte);
                } catch (NumberFormatException exception) {
                    System.out.println("Разрешено вводить только целые числа в диапазоне [-128 .. 127]!");
                }
            }
        }

        return list;
    }
}
