package Day_09;

import java.util.*;

public class Q35 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        char ch = 'A';

        if(n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}