package Day_21;

import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();

        System.out.println("The Length of the given String is " + ch.length);
    }
}