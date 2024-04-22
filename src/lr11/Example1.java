package lr11;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Example1 {
    public static void main(String[] args) {
        var numbers = IntStream.rangeClosed(0, 100).toArray();
        System.out.format("Input: %s.\n", Arrays.toString(numbers));

        var evenNumbers = filterEvenNumbers(numbers);
        System.out.format("Output: %s.\n", Arrays.toString(evenNumbers));
    }

    public static int[] filterEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers).filter(number -> number % 2 == 0).toArray();
    }
}
