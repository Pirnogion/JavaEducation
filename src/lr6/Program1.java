package lr6;

public class Program1 {
    public static void main(String[] args) {
        ListItem item1 = new ListItem();
        item1.set('*');
        item1.set("Eggs");

        ListItem item2 = new ListItem();
        item2.set(new char[] {'>'});
        item2.set(new char[] {'C', 'a', 'r', 'r', 'o', 't'});

        System.out.print("Item #1: ");
        item1.print();

        System.out.print("Item #2: ");
        item2.print();
    }

    static class ListItem {
        private char marker;
        private String text;

        public void set(char marker) {
            this.marker = marker;
        }

        public void set(String text) {
            this.text = text;
        }

        public void set(char[] values) {
            if (values.length == 1) {
                this.marker = values[0];
            } else if (values.length > 1) {
                this.text = String.valueOf(values);
            }
        }

        public void print() {
            System.out.format("%s %s;\n", marker, text);
        }
    }
}

