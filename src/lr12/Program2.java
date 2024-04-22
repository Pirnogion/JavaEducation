package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Program2 {
    private static final Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        var input = IntStream.generate(() -> random.nextInt(0, 10000)).limit(100).boxed().toList();
        System.out.format("Input: %s.\n", input);
        System.out.format("[--] Maximum: %s.\n", input.stream().reduce(Integer.MIN_VALUE, Integer::max));
        System.out.format("[||] Maximum: %s.\n", getMaximumParallel(input));
    }

    public static int getMaximumParallel(List<Integer> list) throws InterruptedException {
        int[] result = {Integer.MIN_VALUE};

        var obj = new Object();

        var logicalCores = Runtime.getRuntime().availableProcessors();
        var threads = getChunked(list, Math.ceilDiv(list.size(), logicalCores)).stream()
            .map(chunk -> new Thread(() -> {
                var maximum = chunk.stream().reduce(Integer.MIN_VALUE, Integer::max);
                synchronized (obj) {
                    if (maximum > result[0]) result[0] = maximum;
                }
            }))
            .toList();

        for (var thread: threads) thread.start();
        for (var thread: threads) thread.join();

        return result[0];
    }

    public static <T> List<List<T>> getChunked(List<T> list, int chunkSize) {
        var chunkCount = Math.ceilDiv(list.size(), chunkSize);
        var tailSize = list.size()%chunkSize;

        var chunks = new ArrayList<List<T>>(chunkCount);
        for (int i = 0; i < chunkCount-1; ++i) {
            chunks.add(list.subList(i*chunkSize, (i+1)*chunkSize));
        }

        var lastChunkSize = (tailSize == 0) ? chunkSize : tailSize;
        chunks.add(list.subList( list.size()-lastChunkSize, list.size()));

        return chunks;
    }
}
