package lr5;

public class Program3 {
    public static void main(String[] args) {
        AB ab1 = new AB();
        AB ab2 = new AB(5);
        AB ab3 = new AB(3, 4);

        System.out.println("Result: ");
        ab1.print();
        ab2.print();
        ab3.print();
    }

    static class AB {
        public int a;
        public int b;

        public AB() {
            this.a = 1;
            this.b = 2;
        }

        public AB(int a) {
            this.a = a;
            this.b = 2;
        }

        public AB(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void print() {
            System.out.format("A: %s, B: %s.\n", a, b);
        }
    }
}

