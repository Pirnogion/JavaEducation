package lr2;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
        System.out.print("Input a number: ");
        
        int number = in.nextInt();
        String result = (number % 4 == 0 && number >= 10) ? "Yes" : "No";
        System.out.printf("%s ≡ 0 (mod 4) and %s ≥ 10? %s.", number, number, result);
        
        in.close();
    }
}
