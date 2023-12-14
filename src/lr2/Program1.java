package lr2;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
        System.out.print("Input a number: ");
        
        int number = in.nextInt();
        String result = (number % 3 == 0) ? "Yes" : "No";
        System.out.printf("%s ≡ 0 (mod 3)? %s.", number, result);
        
        in.close();
    }
}
