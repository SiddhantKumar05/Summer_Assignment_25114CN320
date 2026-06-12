package Day_12;

import java.util.Scanner;

public class Q45 {
    
    public static void palindrome(int n)
    {
        int num = n;
        int reverse = 0;
        while(n>0)
        {
            reverse = (reverse*10) + n%10;
            n = n/10;
        }

        if(num == reverse)
        {
            System.out.println("Palindrome Number"); 
        }
        else
        {
            System.out.println("Not a Palindrome Number"); 
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: "); 
        int n = sc.nextInt();

        if(n < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        palindrome(n);
    }
}