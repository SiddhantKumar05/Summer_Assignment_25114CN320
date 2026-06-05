package Day_6;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int num = n;
        int set = 0;
        
        if(n == 0)
        {
            System.out.println("0");
            return;
        }

        while(num > 0)
        {
            if(num%2 == 1)
            {
                set = set + 1;
            }
            num = num/2;
        }
        
        System.out.println("The Number of Set Bits in " + n + " is " + set);
    }
}