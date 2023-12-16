package lr3;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vvedite razmer massiva: ");

        if (in.hasNextInt()) {
            int n = in.nextInt();
            if (n > 0) {
                int[] massiv = new int[n];
                for (int i = 0; i < n; ++i) {
                    massiv[i] = 5*i+2;
                    System.out.print(5*i+2);
                    System.out.print(" ");
                }
            } else {
                System.out.println("Nevernoe chislo");
            }
        } else {
            System.out.println("Nevernoe chislo");
        }

        in.close();
    }
}
