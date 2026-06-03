package Day_3;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: "); 
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: "); 
        int n2 = sc.nextInt();
        
        int lcm = 0;
        int gcd = 0;

        int n = Math.min(n1, n2);

        for(int i = 1; i <= n; i++)
        {
            if (n1%i == 0 && n2%i == 0) 
            {
                gcd = i;
            }
        }

        lcm = (n1 * n2) / gcd;
        System.out.println("The LCM of " + n1 + " and " + n2 + " is " + lcm);
    }
}