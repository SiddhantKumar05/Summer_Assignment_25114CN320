package Day_21;

import java.util.Scanner;

public class Q84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String z = "";

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                ch = (char)(ch - 32);
            }

            z = z + ch;
        }

        System.out.println("The Uppercase of the given String is: " + z);
    }
}