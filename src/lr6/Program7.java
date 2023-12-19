package lr6;

public class Program7 {
    public static void main(String[] args) {
        CharsEncoder.print(CharsEncoder.encode("Hello, world!".toCharArray()));
    }

    static class CharsEncoder {
        public static int[] encode(char[] chars) {
            int[] codes = new int[chars.length];
            for (int i = 0; i < chars.length; ++i) {
                codes[i] = chars[i];
            }

            return codes;
        }

        public static void print(int[] codes) {
            System.out.print("Codes:");
            for (int value: codes) {
                System.out.format(" %s", value);
            }
            System.out.println(";");
        }
    }
}

