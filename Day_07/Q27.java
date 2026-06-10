package Day_07;

import java.util.Scanner;

public class Q27 {
    public static int sum(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return n%10 + sum(n/10);
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

        System.out.println("The Sum of Digits of " + n + " is " + sum(n));
    }
}