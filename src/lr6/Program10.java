package lr6;

public class Program10 {
    public static void main(String[] args) {
        int[] result = find(7, 2, 3, 9, 5, 6, 1, 8, 4);
        System.out.format("Max: %s, Min: %s;", result[0], result[1]);
    }

    public static int[] find(int ...values) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int value: values) {
            if (value > max) max = value;
            if (value < min) min = value;
        }

        return new int[] {max, min};
    }
}

