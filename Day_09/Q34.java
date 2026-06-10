package Day_09;

import java.util.*;

public class Q34 {
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

        for(int i = n; i > 0; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}