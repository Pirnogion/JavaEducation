package lr13;

public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Ошибка");
        } catch (NullPointerException exception) {
            System.out.println("1 " + exception);
            throw new ArithmeticException();
        } catch (ArithmeticException exception) {
            System.out.println("2 " + exception);
        }

        System.out.println("3");
    }
}
