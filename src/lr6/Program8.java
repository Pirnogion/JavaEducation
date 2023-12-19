package lr6;

public class Program8 {
    public static void main(String[] args) {
        System.out.println(AverageCalculator.calculate(new int[] {5, 6, 3, 0, 2, 2, 2, 1, 2, 2, 1, 2, 1, 2, 2, 3}));
    }

    static class AverageCalculator {
        public static int calculate(int[] values) {
            int avg = 0;
            for (int value: values) {
                avg += value;
            }

            return avg / values.length;
        }
    }
}

