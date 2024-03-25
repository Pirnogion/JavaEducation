package lr9;

public class Example2 {
    public static void main(String[] args) {
        calc(1);
    }

    public static void calc(int x) {
        if ((2 * x + 1) < 20) {
            calc(2 * x + 1);
        }

        System.out.println("x=" + x);
    }
}
