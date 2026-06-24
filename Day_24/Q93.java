package Day_24;

import java.util.Scanner;

public class Q93 {
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
            System.out.println("The 2nd String is not Rotated");
            return;
        }

        if(s1.equals(s2))
        {
            System.out.println("The 2nd String is Rotated");
            return;
        }

        int n = s2.length();
        char a[] = s2.toCharArray();
        boolean b = false;

        for(int i = 0; i < n; i++) 
        {   
            char temp = a[0];
            for(int j = 1; j < n; j++)
            {
                a[j-1] = a[j];
            }
            a[n-1] = temp;

            String x = new String(a);

            if(s1.equals(x)) 
            {
                b= true;
                break;
            }
        }

        if (b) System.out.println("The 2nd String is Rotated");
        else System.out.println("The 2nd String is not Rotated");
    }
}