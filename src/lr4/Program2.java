package lr4;

public class Program2 {
    public static void main(String[] args) {
        for (int i = 0; i < 11; ++i) {
            for (int j = 0; j < 23 && j <= i; ++j) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
