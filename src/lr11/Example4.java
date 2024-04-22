package lr11;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Example4 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        var input = IntStream.generate(() -> random.nextInt(0, 100)).limit(10).boxed().toList();
        System.out.format("Input: %s.\n", input);

        var output = sqrize(input);
        System.out.format("Output: %s.\n", output);
    }

    public static List<Integer> sqrize(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .toList();
    }
}
