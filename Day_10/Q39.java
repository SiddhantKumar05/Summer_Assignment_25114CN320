package Day_10;

import java.util.Scanner;

public class Q39 {
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

        for(int i = 1; i <= n; i++)
        {
            for(int k = 1; k <= (n-i); k++)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++)
            {
                System.out.print(k);
            }

            for(int k = i-1; k >= 1; k--)
            {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}