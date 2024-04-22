package lr13;

public class Example3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (NullPointerException exception) {
            System.out.println("1 " + exception);
        } catch (RuntimeException exception) {
            System.out.println("2 " + exception);
        } catch (Exception exception) {
            System.out.println("3 " + exception);
        }

        System.out.println("4");
    }
}
