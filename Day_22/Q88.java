package Day_22;

import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String a = "";

        for(int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if(ch != ' ') a = a + ch;
        }

        System.out.println("The String after Removing Spaces is: " + a);
    }
}