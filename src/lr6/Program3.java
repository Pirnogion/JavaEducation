package lr6;

public class Program3 {
    public static void main(String[] args) {
        FragsCalculator.calculate1(new int[] {5, 2, 3, 4, 0, 0, 1, 2, 1, 1, 1, 1, 3});
        System.out.print("[Round 1] ");
        FragsCalculator.print();

        FragsCalculator.calculate2(1, 0, -1, 0, -1, -1, 0, 0, 0, 1, 0, 0, 5);
        System.out.print("[Round 2] ");
        FragsCalculator.print();
    }

    static class FragsCalculator {
        private static int maximum = Integer.MIN_VALUE;
        private static int minimum = Integer.MAX_VALUE;
        private static int average = 0;

        public static void calculate1(int[] values) {
            if (values.length == 0) return;

            for (int value: values) {
                if (value > maximum) maximum = value;
                if (value < minimum) minimum = value;

                average += value;
            }

            average /= values.length;
        }

        public static void calculate2(int ...values) {
            calculate1(values);
        }

        public static void print() {
            System.out.format("Max: %s, Min: %s, Avg: %s.\n", maximum, minimum, average);
        }
    }
}

