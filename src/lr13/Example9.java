package lr13;

public class Example9 {
    public static void main(String[] args) {
        System.out.println(m());
    }
    public static int m() {
        try {
            System.out.println("0");
            return 55;
        } finally {
            System.out.println("1");
        }
    }
}
