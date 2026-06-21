package Day_21;

import java.util.Scanner;

public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String r = "";

        for(int i = s.length()-1; i >= 0; i--) 
        {
            r = r + s.charAt(i);
        }

        System.out.println("The Reverse of the given String is " + r);
    }
}