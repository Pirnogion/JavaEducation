package lr12;

public class Example3 {
    public static final Object lock = new Object();
    public static int number = 1;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    if (number % 2 == 0) {
                        System.out.format("Thread: %s, number: %s.\n", Thread.currentThread().getName(), number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                    }

                    lock.notifyAll();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                while (number < 10) {
                    if (number % 2 != 0) {
                        System.out.format("Thread: %s, number: %s.\n", Thread.currentThread().getName(), number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException exception) {
                            exception.printStackTrace();
                        }
                    }

                    lock.notifyAll();
                }
            }
        });

        thread1.setName("Even thread");
        thread2.setName("Odd thread");

        thread1.start();
        thread2.start();
    }
}
