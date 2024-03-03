package lr8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) throws IOException {
        String fileName = Paths.get("").toAbsolutePath() + "/src/lr8/Example3.java";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException exception) {
            System.out.println("Error: " + exception);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /* NOP */
                }
            }
        }
    }

    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buffer = new byte[5];
        while (true) {
            int count = in.read(buffer);
            if (count != -1) {
                System.out.println("Count: " + count + ", buffer: " + Arrays.toString(buffer) + ", string: " + new String(buffer, 0, count, "cp1251"));
            } else {
                break;
            }
        }
    }
}
