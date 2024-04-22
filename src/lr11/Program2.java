package lr11;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Program2 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        var input = IntStream.generate(() -> random.nextInt(0, 100)).limit(20).boxed().toList();
        System.out.format("Input: %s.\n", input);

        var output = filterByModule(input, 5);
        System.out.format("Output: %s.\n", output);
    }

    public static List<Integer> filterByModule(List<Integer> numbers, int module) {
        return numbers.stream()
                .filter(number -> number % module == 0)
                .toList();
    }
}
