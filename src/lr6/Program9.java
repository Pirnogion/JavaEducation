package lr6;

public class Program9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArraySwapper.swap(array);

        System.out.print("Modified array: ");
        for (int value: array) {
            System.out.format(" %s", value);
        }
        System.out.print(";");
    }

    static class ArraySwapper {
        public static void swap(int[] values) {
            for (int i = 0; i < values.length/2; ++i) {
                int buffer = values[i];
                values[i] = values[values.length-1-i];
                values[values.length-1-i] = buffer;
            }
        }
    }
}

