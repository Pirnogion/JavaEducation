package lr3;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Vvedite nazvanie dna nedely: ");

        switch (in.next()) {
            case "ponedelnik": System.out.println(1); break;
            case "vtornik": System.out.println(2); break;
            case "sreda": System.out.println(3); break;
            case "chetverg": System.out.println(4); break;
            case "patniza": System.out.println(5); break;
            case "subbota": System.out.println(6); break;
            case "voskresenye": System.out.println(7); break;
            default: System.out.println("NEPONATNO!");
        }

        System.out.print("Vvedite eshe: ");
        String name = in.next();

        if (name.equals("ponedelnik")) {
            System.out.println(1);
        } else {
            if (name.equals("vtornik")) {
                System.out.println(2);
            } else {
                if (name.equals("sreda")) {
                    System.out.println(3);
                } else {
                    if (name.equals("chetverg")) {
                        System.out.println(4);
                    } else {
                        if (name.equals("pathiza")) {
                            System.out.println(5);
                        } else {
                            if (name.equals("subbota")) {
                                System.out.println(6);
                            } else {
                                if (name.equals("voskresenye")) {
                                    System.out.println(7);
                                } else {
                                    System.out.println("NEPONATNO!");
                                }
                            }
                        }
                    }
                }
            }
        }

        in.close();
    }
}
