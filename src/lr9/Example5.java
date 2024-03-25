package lr9;

public class Example5 {
    private static int deep = 0;

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        System.out.println(".".repeat(deep++) + n);

        if (n == 0) {
            deep--;
            return 0;
        } else if (n == 1) {
            deep--;
            return 1;
        } else {
            int r = fib(n - 2) + fib(n - 1);
            deep--;
            return r;
        }
    }
}
