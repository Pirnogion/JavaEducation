package lr8;

import java.io.*;
import java.nio.file.Paths;

public class Example9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(Paths.get("").toAbsolutePath() + "/MyFile1.txt"), "cp1251"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(Paths.get("").toAbsolutePath() + "/MyFile2.txt"), "cp1251"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!!!!!");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
