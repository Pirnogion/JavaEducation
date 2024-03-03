package lr8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) throws IOException {
        generateSource();
        extractData();
    }

    public static void extractData() throws IOException {
        var scanner = new Scanner(new File("File1.txt"), StandardCharsets.UTF_8);
        var writer = new PrintWriter("File2.txt", StandardCharsets.UTF_8);

        scanner.nextLine();
        writer.println(scanner.nextLine());

        for (int i = 0; i < 5; ++i) {
            var value = Double.parseDouble(scanner.nextLine());
            if (value > 0) writer.println(value);
        }

        writer.flush();
        writer.close();
        scanner.close();
    }

    public static void generateSource() throws IOException {
        var random = new Random();
        var writer = new PrintWriter("File1.txt", StandardCharsets.UTF_8);

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 32; ++j) {
                writer.print(Character.toString(32 + random.nextInt(95)));
            }

            writer.println();
        }

        for (int i = 0; i < 5; ++i) {
            writer.println(random.nextDouble(-10, +10));
        }

        writer.flush();
        writer.close();
    }
}
