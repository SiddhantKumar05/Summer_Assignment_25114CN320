package Day_7;

import java.util.Scanner;

public class Q26 {
    public static int fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(n == 1)
        {
            System.out.println("0");
            return;
        }

        System.out.print("Fibonacci Series: 0");
        for(int i = 1; i <= n-1; i++)
        {
            System.out.print(", ");
            System.out.print(fibonacci(i));
        }
    }
}