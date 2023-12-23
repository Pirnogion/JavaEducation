package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1009 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int length = in.nextInt();
		int base = in.nextInt();

		long result = (long)Math.pow(base-1, length);
		for (int i = 0; i+1 <= length-i; ++i) {
			result += calculateCombinations(length-i-1, i+1) * (long)Math.pow(base-1, length-i-1);
		}

		out.print(result);

		out.flush();
		in.close();
    }

    private static long calculateCombinations(int n, int k) {
    	return calculateFactorial(n) / ( calculateFactorial(n-k) * calculateFactorial(k) );
	}

	private static long calculateFactorial(int n) {
		long factorial = 1;
		for (int i = 1; i <= n; ++i) {
			factorial *= i;
		}

		return factorial;
	}
}