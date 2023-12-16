package lr3;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String vowels = "AEIOU";

        char[] stroka = new char[10];
        for (int i = 0, l = 0; l < 10; ++i) {
            char letter = (char)(65+i);
            if (vowels.indexOf(letter) == -1) {
                stroka[l++] = letter;
            }
        }

        for (int i = 0; i < 10; ++i) {
            System.out.print(stroka[i]);
            System.out.print(" ");
        }

        in.close();
    }
}
