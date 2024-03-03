package lr8;

import java.io.*;
import java.net.URL;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inFile = new FileInputStream(Paths.get("").toAbsolutePath() + "/src/lr8/Example2.java");
            readAllByByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("https://www.google.com/").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        } catch (IOException exception) {
            System.out.println("Error: " + exception);
        }
    }

    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char)oneByte);
            } else {
                System.out.print("\nend");
                break;
            }
        }
    }
}
