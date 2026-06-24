package Day_24;

import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        char a[] = s.toCharArray();
        char b[] = new char[s.length()];
        int z = 0;

        for(int i = 0; i < s.length(); i++)
        {
            boolean f = false;
            for(int j = 0; j < z; j++)
            {
                if(b[j] == a[i]) 
                {
                    f = true;
                    break;
                }   
            }
            if (f == false)
            { 
                b[z] = a[i];
                ++z;
            }
        }

        System.out.println("String after Removing Duplicate Characters: ");
        for(int i = 0; i < z; i++)
        {
            System.out.print(b[i]);
        }
    }
}