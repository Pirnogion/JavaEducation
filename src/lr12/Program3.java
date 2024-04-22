package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Program3 {
    private static final Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        var input = IntStream.generate(() -> random.nextInt(0, 10000)).limit(100).boxed().toList();
        System.out.format("Input: %s.\n", input);
        System.out.format("[--] Maximum: %s.\n", input.stream().reduce(0, Integer::sum));
        System.out.format("[||] Maximum: %s.\n", getSumParallel(input));
    }

    public static int getSumParallel(List<Integer> list) throws InterruptedException {
        int[] result = {0};

        var obj = new Object();

        var logicalCores = Runtime.getRuntime().availableProcessors();
        var threads = getChunked(list, Math.ceilDiv(list.size(), logicalCores)).stream()
            .map(chunk -> new Thread(() -> {
                var sum = chunk.stream().reduce(0, Integer::sum);
                synchronized (obj) {
                    result[0] += sum;
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
