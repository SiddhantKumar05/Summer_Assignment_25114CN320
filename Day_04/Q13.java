package Day_04;

import java.util.Scanner;

public class Q13 
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

        System.out.print("0, 1");

        for(int i = 1; i <= n-2; i++)
        {
            System.out.print(", ");
            c = a + b;
            a = b;
            b = c;
            System.out.print(c);
        }
    }
}