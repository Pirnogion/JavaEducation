package lr13;

public class Example4 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException exception) {
            System.out.println("1 " + exception);
        } catch (Exception exception) {
            System.out.println("2 " + exception);
        } catch (Error exception) {
            System.out.println("3 " + exception);
        }

        System.out.println("4");
    }
}
