package Day_05;

import java.util.Scanner;

public class Q20 {

    public static boolean prime(int n)
    {
        int f = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                f = f + 1;
            }
        }

        if(f == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

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

        int p = -1;
        for(int i = 2; i <= n; i++)
        {
            if(n % i == 0)
            {
                if(prime(i))
                {
                    p = i;
                }
            }
        }

        System.out.print("The Largest Prime Factor of " + n + " is " + p);
    }
}