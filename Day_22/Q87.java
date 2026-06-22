package Day_22;

import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++) 
        {
            int f = 0;
            boolean printed = false;

            for(int j = 0; j < s.length(); j++) 
            {
                if(s.charAt(i) == s.charAt(j)) ++f;
            }
            
            for(int k = 0; k < i; k++)
            {
                if(s.charAt(i) == s.charAt(k))
                {
                    printed = true;
                    break;
                }
            }
            
            if(printed == false) System.out.println("The Frequency of Character " + s.charAt(i) + " is " + f);
        }
    }
}