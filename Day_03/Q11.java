package Day_03;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: "); 
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: "); 
        int n2 = sc.nextInt();
        
        int gcd = 0;
        
        int n = Math.min(n1, n2);

        for(int i = 1; i <= n; i++)
        {
            if (n1%i == 0 && n2%i == 0) 
            {
                gcd = i;
            }
        }

        System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}