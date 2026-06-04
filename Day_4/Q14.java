package Day_4;

import java.util.Scanner;

public class Q14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;

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

        if(n == 2)
        {
            System.out.println("1");
            return;
        }

        for(int i = 1; i <= n-2; i++)
        {
            c = a + b;
            a = b;
            b = c;
            if(i+2 == n)
            {
                System.out.print("The " + n +"th Fibonacci term is " + c);
            }
        }
    }
}
