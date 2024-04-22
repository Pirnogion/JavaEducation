package lr11;

import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        var input = List.of("Шел дождь. Над темными улицами города нависал непроглядный Туман!".split(" "));
        System.out.format("Input: %s.\n", input);

        var output = filterBySubstring(input, "н");
        System.out.format("Output: %s.\n", output);
    }

    public static List<String> filterBySubstring(List<String> strings, String substring) {
        return strings.stream()
                .filter(string -> string.contains(substring))
                .toList();
    }
}
