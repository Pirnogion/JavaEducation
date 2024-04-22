package lr12;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; ++i) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        });

        thread1.start();
        thread1.join();
    }
}
