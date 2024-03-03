package lr8;

import java.io.*;
import java.nio.file.Paths;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(Paths.get("").toAbsolutePath() + "/MyFile1.txt"), 1024);
            bw = new BufferedWriter(new FileWriter(Paths.get("").toAbsolutePath() + "/MyFile2.txt"));

            int count = 0;
            String s;

            while ((s = br.readLine()) != null) {
                count++;
                System.out.println(count + ": " + s);
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException exception) {
            System.out.println("Error!");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
