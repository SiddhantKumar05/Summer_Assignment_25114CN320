package Day_23;

import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean b = false;

        for(int i = 0; i < s.length(); i++) 
        {
            int f = 0;

            for(int j = 0; j < s.length(); j++) 
            {
                if(s.charAt(i) == s.charAt(j)) ++f;
            }
            
            if (f == 1) 
            {
                System.out.println("The First Non-Repeating Character is: " + s.charAt(i));
                b = true;
                break;
            }
        }
    
        if (b == false) System.out.println("No such Character exists in the given String");
    }
}