import java.util.*;

public class Main {
    public static double hexaAnswer = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String s = scan.nextLine();

        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        if (s.charAt(1) == 'X')
            s = s.substring(2);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            double d = digits.indexOf(c);
            hexaAnswer = 16 * hexaAnswer + d;
        }
        System.out.println("Your number is " + String.format("%.0f", hexaAnswer) + " in decimal");

    }
}



 