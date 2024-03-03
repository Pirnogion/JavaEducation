package lr8;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        try {
            File f1 = new File("file1.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Enter count of numbers: ");
            int count = sc.nextInt();
            System.out.println("Enter numbers: ");
            for (int i = 0; i < count; i++)
                wr.writeFloat(sc.nextFloat());
            wr.flush();
            wr.close();
            File f2 = new File("file2.txt");
            f2.createNewFile();
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Number: " + number);
                }
            } catch (EOFException e) {
            }
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
