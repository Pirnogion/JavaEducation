package lr6;

public class Program2 {
    public static void main(String[] args) {
        Box.print();
        Box.print();
        Box.print();
        Box.print();
        Box.print();
    }

    static class Box {
        private static int usages = 0;

        public static void print() {
            System.out.format("Usages: %s.\n", usages++);
        }
    }
}

