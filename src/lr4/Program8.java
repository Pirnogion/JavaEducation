package lr4;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String raw = in.nextLine();

        System.out.print("Enter encryption key: ");
        int key = in.nextInt();

        char[] encrypted = raw.toCharArray();
        for (int i = 0; i < encrypted.length; ++i) {
            encrypted[i] = (char)(encrypted[i] + key);
        }

        System.out.format("%s -> %s.\n", raw, new String(encrypted));

        System.out.print("Decrypt? [y\\n] ");
        while (in.hasNext()) {
            String answer = in.next();
            if (answer.equalsIgnoreCase("y")) {
                char[] decrypted = new char[encrypted.length];
                for (int i = 0; i < decrypted.length; ++i) {
                    decrypted[i] = (char)(encrypted[i] - key);
                }

                System.out.format("Decrypted: %s.", new String(decrypted));

                break;
            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Enter an correct value.");
            }
        }

        in.close();
    }
}
