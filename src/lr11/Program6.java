package lr11;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Program6 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        var input = IntStream.generate(() -> random.nextInt(0, 100)).limit(20).boxed().toList();
        System.out.format("Input: %s.\n", input);

        var output = filterLessThanValue(input, 43);
        System.out.format("Output: %s.\n", output);
    }

    public static List<Integer> filterLessThanValue(List<Integer> numbers, int value) {
        return numbers.stream()
                .filter(number -> number < value)
                .toList();
    }
}
