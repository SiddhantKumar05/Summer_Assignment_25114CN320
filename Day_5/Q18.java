package Day_5;

import java.util.Scanner;

public class Q18 {

    public static int factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        
        if(n == 0)
        {
            sum = factorial(0);
        }

        while(num > 0)
        {
            sum = sum + factorial(num%10);
            num = num/10;
        }
        
        if(n == sum)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
}