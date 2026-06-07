package Day_7;

import java.util.*;

public class Q28 {
    public static int reverse(int n, int d)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return (n%10)*(int)Math.pow(10, d) + reverse((n/10), d-1);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int num = n;
        int d = 0;
        if(n < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        while(num > 0)
        {
            d = d + 1;
            num = num/10;
        }
        System.out.println("The Reverse of Number " + n + " is " + reverse(n,d-1));
    }
}