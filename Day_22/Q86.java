package Day_22;

import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        int w = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
            {
                w++;
            }
        }

        System.out.println("Number of Words in the given String is: " + w);
    }
}