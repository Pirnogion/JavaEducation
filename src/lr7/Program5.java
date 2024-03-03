package lr7;

class Super {
    private String text;

    public Super(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Super{" +
                "text='" + text + '\'' +
                '}';
    }
}

class Sub1 extends Super {
    private int number;

    public Sub1(int number, String text) {
        super(text);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Sub1{" +
                "number=" + number +
                '}' +
                " -> " +
                super.toString();
    }
}

class Sub2 extends Super {
    private char symbol;

    public Sub2(char symbol, String text) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Sub2{" +
                "symbol=" + symbol +
                '}' +
                " -> " +
                super.toString();
    }
}

public class Program5 {
    private static Sub1 sub1 = new Sub1(6, "net");
    private static Sub2 sub2 = new Sub2('k', "ek");

    public static void main(String[] args) {
        System.out.println(sub1);
        System.out.println(sub2);
    }
}
