package lr13;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (NullPointerException exception) {
            System.out.println("1 " + exception);
        }

        System.out.println("2");
    }
}
