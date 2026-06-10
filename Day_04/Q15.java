package Day_04;

import java.util.*;

public class Q15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int num = n;

        int digits = 0;
        double sum = 0;
        while(num>0)
        {
            digits = digits + 1;
            num = num / 10;
        }

        num = n;

        while(num>0)
        {
            sum = sum + Math.pow(num%10, digits);
            num = num / 10;
        }
        
        if(n == sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong Number");
        }
    }
}