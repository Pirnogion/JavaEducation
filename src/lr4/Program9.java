package lr4;

import java.util.Scanner;

public class Program9 {
    public static final char undefined = '\0';
    public static final char[] alphabet = {
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '?', '.', ':', ';', ',', '[', ']', '{', '}', '(', ')', '_', '-', '=', '+', '*',
        '/', '&', '^', '%', '$', '#', '@', '!', '~', '<', '>', '\'', '\"', '№', ' ', '|', '\\', '/', '`'
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String raw = in.nextLine();

        System.out.print("Enter encryption key: ");
        int key = in.nextInt();

        char[] encrypted = raw.toCharArray();
        for (int i = 0; i < encrypted.length; ++i) {
            int position = indexOf(encrypted[i]);
            if (position < 0) {
                encrypted[i] = undefined;
                continue;
            }

            int shift = (position + key) % alphabet.length;
            int index = (shift < 0) ? alphabet.length + shift : shift;
            encrypted[i] = alphabet[index];
        }

        System.out.format("%s -> %s.\n", raw, new String(encrypted));

        System.out.print("Decrypt? [y\\n] ");
        while (in.hasNext()) {
            String answer = in.next();
            if (answer.equalsIgnoreCase("y")) {
                char[] decrypted = new char[encrypted.length];
                for (int i = 0; i < decrypted.length; ++i) {
                    int position = indexOf(encrypted[i]);
                    if (position < 0) {
                        decrypted[i] = undefined;
                        continue;
                    }

                    int shift = (position - key) % alphabet.length;
                    int index = (shift < 0) ? alphabet.length + shift : shift;
                    decrypted[i] = alphabet[index];
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

    public static int indexOf(char value) {
        for (int i = 0; i < alphabet.length; ++i) {
            if (alphabet[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
