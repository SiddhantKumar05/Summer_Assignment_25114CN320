package Day_23;

import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        int f = 0;
        int k = 0;

        for(int i = 0; i < s.length(); i++) 
        {
            int a = 0;
            for(int j = 0; j < s.length(); j++) 
            {
                if(s.charAt(i) == s.charAt(j)) ++a;
            }
            if(a > f) 
            {
                f = a;
                k = i;
            }
        }
        
        System.out.println("The Maximum Frequency Character is: "+ s.charAt(k));
    }
}