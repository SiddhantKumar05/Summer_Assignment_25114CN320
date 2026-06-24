package Day_24;

import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        

        for(int i = 0; i < s.length(); )
        {
            int f = 1;

            while(i + f < s.length() && s.charAt(i) == s.charAt(i + f))
            {
                f++;
            }

            System.out.print(s.charAt(i) + "" + f);
            i = i + f;
        }
    }
}