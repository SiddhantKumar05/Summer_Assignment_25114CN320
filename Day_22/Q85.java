package Day_22;

import java.util.Scanner;

public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String r = "";

        for(int i = s.length()-1; i >= 0; i--) 
        {
            r = r + s.charAt(i);
        }

        if(s.equals(r)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}