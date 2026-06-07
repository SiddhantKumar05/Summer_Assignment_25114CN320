package Day_7;

import java.util.Scanner;

public class Q25 {
    public static int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) 
    {
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