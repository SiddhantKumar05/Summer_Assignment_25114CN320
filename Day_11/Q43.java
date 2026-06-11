package Day_11;

import java.util.Scanner;

public class Q43 {
    
    public static void prime(int n)
    {
        int d = 0;

        if (n <= 1) 
        {
            System.out.println("Not a Prime Number");
            return;
        }       
        
        for(int i = 2; i <= n; i++)
        {
            if (n%i == 0) 
            {
                d = d + 1;
            }
        }

        if(d == 1)
        {
            System.out.println("Prime Number"); 
        }
        else
        {
            System.out.println("Not a Prime Number"); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        prime(n);
    }
}