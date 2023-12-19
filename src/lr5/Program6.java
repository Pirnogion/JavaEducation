package lr5;

public class Program6 {
    public static void main(String[] args) {
        Resource resource = new Resource(32, 12);

        System.out.print("[First] ");
        resource.print();

        resource.set(-2, 5);
        System.out.print("[Second] ");
        resource.print();

        resource.set(2);
        System.out.print("[Third] ");
        resource.print();
    }

    static class Resource {
        private int max;
        private int min;

        public Resource(int value1, int value2) {
            set(value1, value2);
        }

        public void set(int value) {
            max = min = value;
        }

        public void set(int value1, int value2) {
            max = Math.max(value1, value2);
            min = Math.min(value1, value2);
        }

        public void print() {
            System.out.format("Max: %s, Min: %s.\n", max, min);
        }
    }
}

