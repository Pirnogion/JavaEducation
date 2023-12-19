package lr5;

public class Program1 {
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.set('Q');

        System.out.format("Letter code: %s.\n", letter.getCode());
        letter.print();
    }

    static class Letter {
        private char letter;

        public void set(char letter) {
            this.letter = letter;
        }

        public void print() {
            System.out.format("Letter: %s, code: %s.\n", letter, (int)letter);
        }

        public int getCode() {
            return letter;
        }
    }
}

