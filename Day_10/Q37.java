package Day_10;

import java.util.*;

public class Q37 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = (n-i); j >= 1; j--)
            {
                System.out.print(" ");
            }

            for(int k = 1; k <= ((2*i)-1); k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}