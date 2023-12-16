package lr3;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vvedite den nedely: ");

        switch (in.nextInt()) {
            case 1: System.out.println("Panedelnik"); break;
            case 2: System.out.println("Vtornig"); break;
            case 3: System.out.println("Sreda"); break;
            case 4: System.out.println("Chetverk"); break;
            case 5: System.out.println("Patnizza"); break;
            case 6: System.out.println("Subbota"); break;
            case 7: System.out.println("Voskresenye"); break;
            default: System.out.println("Figna kakay-to");
        }

        in.close();
    }
}
