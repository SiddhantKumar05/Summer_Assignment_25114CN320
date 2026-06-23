package Day_23;

import java.util.Arrays;
import java.util.Scanner;

public class Q91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String: ");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        System.out.print("Enter the 2nd String: ");
        String s2 = sc.nextLine();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length())
        {
            System.out.println("Not Anagram");
            return;
        }

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();    
        
        Arrays.sort(a);
        Arrays.sort(b);

        String x = new String(a);
        String y = new String(b);

        if(x.equals(y))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}