package lr2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
        System.out.print("Input a number: ");
        
        int number = in.nextInt();
        String result = (number >= 5 && number <= 10) ? "Yes" : "No";
        System.out.printf("5 ≤ %s ≤ 10? %s.", number, result);
        
        in.close();
    }
}
