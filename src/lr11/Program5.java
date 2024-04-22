package lr11;

import java.util.List;

public class Program5 {
    public static void main(String[] args) {
        var input = List.of("Был 1993 год. Шел дождь. Над темными улицами города нависал непроглядный Туман!".split(" "));
        System.out.format("Input: %s.\n", input);

        var output = filterWords(input);
        System.out.format("Output: %s.\n", output);
    }

    public static List<String> filterWords(List<String> strings) {
        return strings.stream()
                .filter(string -> string.matches("\\p{L}+"))
                .toList();
    }
}
