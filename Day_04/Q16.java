package Day_04;

import java.util.*;

public class Q16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number: "); 
        int n1 = sc.nextInt();
        System.out.print("Enter Ending Number: "); 
        int n2 = sc.nextInt();

        for(int i = n1; i <= n2; i++)
        {
            int num = i;

            int digits = 0;
            double sum = 0;
            while(num>0)
            {
                digits = digits + 1;
                num = num / 10;
            }

            num = i;

            while(num>0)
            {
                sum = sum + Math.pow(num%10, digits);
                num = num / 10;
            }
            
            if(i == sum)
            {
                System.out.println(i);
            }
        }
    }
}