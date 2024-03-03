package lr8;

import java.io.*;
import java.nio.file.Paths;

public class Example6 {
    public static void main(String[] args) {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader(Paths.get("").toAbsolutePath() + "/MyFile1.txt");
            out = new FileWriter(Paths.get("").toAbsolutePath() + "/MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ignore) {
                    /* NOP */
                }
            }

            if (out != null) {
                try {
                    out.close();
                } catch (IOException ignore) {
                    /* NOP */
                }
            }
        }
    }
}
