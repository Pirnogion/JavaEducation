package lr13;

public class Example6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("Ошибка");
        } catch (ArithmeticException exception) {
            System.out.println("1 " + exception);
        } catch (Exception exception) {
            System.out.println("2 " + exception);
        } //catch (RuntimeException exception) {
//            System.out.println("3 " + exception);
//        }

        System.out.println("4");
    }
}
