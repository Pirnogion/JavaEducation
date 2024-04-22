package lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Example2 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        var numbers1 = IntStream.generate(() -> random.nextInt(0, 100)).limit(20).toArray();
        var numbers2 = IntStream.generate(() -> random.nextInt(0, 100)).limit(20).toArray();
        System.out.format("Input:\n1. %s,\n2. %s.\n", Arrays.toString(numbers1), Arrays.toString(numbers2));

        var numbers = intersect(numbers1, numbers2);
        System.out.format("Output: %s.\n", Arrays.toString(numbers));
    }

    public static int[] intersect(int[] numbers1, int[] numbers2) {
        return Arrays.stream(numbers1)
                .filter(a -> Arrays.stream(numbers2).anyMatch(b -> b == a))
                .toArray();
    }
}
