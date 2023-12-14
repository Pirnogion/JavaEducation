package lr2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
        System.out.print("Input a number: ");
        
        int number = in.nextInt();
        String result = (number % 35 == 22) ? "Yes" : "No";
        System.out.printf("%s ≡ 2 (mod 5) and %s ≡ 1 (mod 7)? %s.", number, number, result);
        
        in.close();
    }
}
