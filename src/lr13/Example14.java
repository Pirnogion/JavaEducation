package lr13;

public class Example14 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива = " + l);
            m(l);
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        }
    }

    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }
}
