package Day_24;

import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String: ");
        String s = sc.nextLine();
        s = s + " ";
        
        int n = 0;
        String w = "";
        int a = 0;
        String b = "";

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ') 
            {
                ++a;
                b = b + s.charAt(i);
            }
            else
            {
                if(a > n) 
                {
                    n = a;
                    w = b;
                }
                a = 0;
                b = "";
            } 
        }

        System.out.println("The Word with Longest Length is: " + w);
    }
}