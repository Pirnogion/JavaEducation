package lr5;

public class Program4 {
    public static void main(String[] args) {
        StrangeClass what1 = new StrangeClass('X', 65);
        StrangeClass what2 = new StrangeClass(65.179812);

        System.out.println("Result: ");
        what1.print();
        what2.print();
    }

    static class StrangeClass {
        public char letter;
        public int integer;

        public StrangeClass(char letter, int integer) {
            this.letter = letter;
            this.integer = integer;
        }

        public StrangeClass(double value) {
            this.letter = (char)value;
            this.integer = (int)((value - (int)value)*100);
        }

        public void print() {
            System.out.format("Letter: %s, Integer: %s.\n", letter, integer);
        }
    }
}

