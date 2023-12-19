package lr6;

public class Program4 {
    public static void main(String[] args) {
        System.out.format("0!! = %s.\n", HeavyCalculator.calculate(0));
        System.out.format("1!! = %s.\n", HeavyCalculator.calculate(1));
        System.out.format("2!! = %s.\n", HeavyCalculator.calculate(2));
        System.out.format("3!! = %s.\n", HeavyCalculator.calculate(3));
        System.out.format("4!! = %s.\n", HeavyCalculator.calculate(4));
        System.out.format("8!! = %s.\n", HeavyCalculator.calculate(8));
        System.out.format("15!! = %s.\n", HeavyCalculator.calculate(15));
        System.out.format("17!! = %s.\n", HeavyCalculator.calculate(17));
        System.out.format("33!! = %s.\n", HeavyCalculator.calculate(33));
    }

    static class HeavyCalculator {
        public static long calculate(int value) {
            long f = 1;
            for (int i = value; i > 0; i -= 2) {
                f *= i;
            }

            return f;
        }
    }
}

