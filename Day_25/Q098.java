package Day_25;

import java.util.Scanner;

public class Q098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st String: ");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        System.out.print("Enter the 2nd String: ");
        String s2 = sc.nextLine();
        s2 = s2.toLowerCase();

        int n1 = s1.length();
        int n2 = s2.length();
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        char c[] = new char[n1+n2];
        int z = 0;

        for(int i = 0; i < n1; i++)
        {
            boolean f = false;
            for(int j = 0; j < n2; j++)
            {
                if(a[i] == b[j])
                {
                    for(int k = 0; k < z; k++)
                    {
                        if(c[k] == a[i]) 
                        {
                            f = true;
                            break;
                        }   
                    }
                    if (f == false)
                    { 
                        c[z] = a[i];
                        ++z;
                    }
                }
            }
        }

        System.out.println("The Common Characters of 1st and 2nd Strings are: ");
        for(int i = 0; i < z; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}