package lr6;

public class Program5 {
    public static void main(String[] args) {
        System.out.format("f(1) = %s, g(1) = %s.\n", Calculator.f(1), Calculator.g(1));
        System.out.format("f(4) = %s, g(4) = %s.\n", Calculator.f(4), Calculator.g(4));
        System.out.format("f(12) = %s, g(12) = %s.\n", Calculator.f(12), Calculator.g(12));
        System.out.format("f(32) = %s, g(32) = %s.\n", Calculator.f(32), Calculator.g(32));
        System.out.format("f(33) = %s, g(33) = %s.\n", Calculator.f(33), Calculator.g(33));
        System.out.format("f(6) = %s, g(6) = %s.\n", Calculator.f(6), Calculator.g(6));
    }

    static class Calculator {
        public static int f(int value) {
            int result = 0;
            for (int i = 1; i <= value; ++i) {
                result += i*i;
            }

            return result;
        }

        public static int g(int value) {
            return value * (value+1) * (2*value+1) / 6;
        }
    }
}

