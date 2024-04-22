package lr11;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        var input = List.of("Шел дождь. Над темными улицами города нависал непроглядный Туман!".split(" "));
        System.out.format("Input: %s.\n", input);

        var output = filterStrings(input);
        System.out.format("Output: %s.\n", output);
    }

    public static List<String> filterStrings(List<String> strings) {
        return strings.stream()
                .filter(string -> Character.isUpperCase(string.charAt(0)))
                .toList();
    }
}
