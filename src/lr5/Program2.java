package lr5;

public class Program2 {
    public static void main(String[] args) {
        LetterRange range = new LetterRange();

        System.out.print("Range:");
        range.print();
    }

    static class LetterRange {
        public char from = 'H';
        public char to = '+';

        public void print() {
            int direction = Integer.signum(to - from);
            for (char letter = from; letter != to+direction; letter += direction) {
                System.out.format(" %s", letter);
            }
        }
    }
}

