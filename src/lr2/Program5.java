package lr2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
        System.out.print("Input a number: ");
        
        int number = in.nextInt();
        int result = number / 1000;
        System.out.printf("Thousand: %s.", result);
        
        in.close();
    }
}
