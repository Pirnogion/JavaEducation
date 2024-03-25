package lr9;

public class Example1 {
    public static void main(String[] args) {
        calc(1);
    }

    public static void calc(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            calc(2 * x + 1);
        }
    }
}
