package lr8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.StringJoiner;

public class Program2 {
    public static final String CONSONANTS_LETTERS = "бБвВгГдДжЖзЗйЙкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩ";

    public static void main(String[] args) throws IOException {
        var scanner = new Scanner(new File("File1.txt"), StandardCharsets.UTF_8);
        var writer = new PrintWriter("File2.txt", StandardCharsets.UTF_8);

        for (int line = 1; scanner.hasNextLine(); ++line) {
            var words = scanner.nextLine().split("[^\\pL\\pM\\p{Nd}\\p{Nl}\\p{Pc}[\\p{InEnclosedAlphanumerics}&&\\p{So}]]|\s+");

            var matches = 0;
            var list = new StringJoiner(", ");
            for (var word: words) {
                if (word.isEmpty() || !CONSONANTS_LETTERS.contains(word.subSequence(0, 1))) continue;

                matches += 1;
                list.add(word);
            }

            if (matches > 0) writer.format("[%s, %s] %s;\n", line, matches, list);
        }

        writer.flush();
        writer.close();
        scanner.close();
    }
}
