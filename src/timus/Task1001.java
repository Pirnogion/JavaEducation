package timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        
        ArrayList<Long> values = new ArrayList<Long>();
        while (in.hasNextLong()) {
        	values.add(in.nextLong());
        }
        
        for (int i = values.size()-1; i >= 0; --i) {
        	out.format("%.4f\n", Math.sqrt(values.get(i)));
        }
        
        out.flush();
        in.close();
    }
}