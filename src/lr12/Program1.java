package lr12;

public class Program1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            final int threadIndex = i;
            Thread thread = new Thread(() -> {
                System.out.format("Thread: %s, id: %s.\n", Thread.currentThread().getName(), threadIndex);
            });

            thread.start();
            thread.join();
        }
    }
}
