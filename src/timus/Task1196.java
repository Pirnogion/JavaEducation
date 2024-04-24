package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Task1196 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int teacher = Integer.parseInt(in.readLine());

        Set<String> records = new HashSet<>();
        for (int i = 0; i < teacher; ++i) {
            records.add(in.readLine());
        }

        int student = Integer.parseInt(in.readLine());

        int matches = 0;
        for (int i = 0; i < student; ++i) {
            if (records.contains(in.readLine())) matches += 1;
        }

        out.print(matches);

        out.flush();
        out.close();
        in.close();
    }
}
