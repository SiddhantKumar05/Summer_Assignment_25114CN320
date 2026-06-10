package Day_05;

import java.util.*;

public class Q17 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int factors = 0;
        
        for(int i = 1; i < n; i++)
        {
            if (n % i == 0) 
            {
                factors = factors + i;
            }
        }
        
        if(n == factors)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}