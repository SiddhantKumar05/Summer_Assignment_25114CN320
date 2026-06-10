package Day_06;

import java.util.*;

public class Q22 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        double sum = 0;
        int i = 0;

        while(num > 0)
        {
            sum = sum + ((num%10)*Math.pow(2, i));
            num = num/10;
            i = i + 1;
        }
        
        System.out.print("The Decimal Value is " + (int)sum);
    }
}