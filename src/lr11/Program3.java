package lr11;

import java.util.List;

public class Program3 {
    public static void main(String[] args) {
        var input = List.of("Шел дождь. Над темными улицами города нависал непроглядный Туман!".split(" "));
        System.out.format("Input: %s.\n", input);

        var output = filterByLength(input, 10);
        System.out.format("Output: %s.\n", output);
    }

    public static List<String> filterByLength(List<String> strings, int length) {
        return strings.stream()
                .filter(string -> string.length() > length)
                .toList();
    }
}
