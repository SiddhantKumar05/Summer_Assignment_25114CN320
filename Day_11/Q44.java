package Day_11;

import java.util.Scanner;

public class Q44 {
    
    public static int factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(n < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("The Factorial of " + n + " is " + factorial(n));
    }
}