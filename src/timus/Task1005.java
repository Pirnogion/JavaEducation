package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task1005 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = in.nextInt();

		int[] values = new int[n];
		for (int i = 0; i < n; ++i) {
			values[i] = in.nextInt();
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < Math.pow(2, n); ++i) {
			int sum = 0;
			for (int j = 0; j < n; ++j) {
				boolean isPositive = (i & 1 << j) == 0;
				sum += (isPositive) ? values[j] : -1 * values[j];
			}

			int diff = Math.abs(sum);
			if (diff < min) min = diff;
		}

		out.print(min);

		out.flush();
		in.close();
    }
}