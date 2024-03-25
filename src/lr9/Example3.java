package lr9;

public class Example3 {
    private static int step = 0;

    public static void main(String[] args) {
        calc(1);
    }

    public static void calc(int x) {
        space();
        System.out.println("" + x + "-> ");
        step++;
        if ((2 * x + 1) < 20) {
            calc(2 * x + 1);
        }
        step--;
        space();
        System.out.println("" + x + " <-");
    }

    public static void space() {
        for (int i = 0; i < step; ++i) {
            System.out.print(" ");
        }
    }
}
