package Day_09;

import java.util.*;

public class Q36 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(n == 1)
        {
            System.out.println("*");
            return;
        }
        
        for(int i = 1; i <= n; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        for(int i = 1; i <= n-2; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j == 1 || j == n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = 1; i <= n; i++)
        {
            System.out.print("*");
        }
    }
}