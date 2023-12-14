package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int value = in.nextInt();
        int sum = (value > 0) ? value*(value+1)/2 : (2-value)*(value+1)/2;
        
        out.print(sum);
        
        out.flush();
        in.close();
    }
}