package lr13;

public class Example11 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Ошибка");
        } catch (NullPointerException exception) {
            System.out.println("1");
        } finally {
            System.out.println("2");
        }

        System.out.println("3");
    }
}
