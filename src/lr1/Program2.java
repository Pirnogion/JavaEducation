package lr1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.print("Input age: ");
        Integer age = in.nextInt();

        System.out.printf("Name: %s; Age: %s.", name, age);

        in.close();
    }
}
