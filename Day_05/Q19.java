package Day_05;

import java.util.Scanner;

public class Q19 {
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
        
        System.out.print("The Factors of " + n + " are: 1");

        for(int i = 2; i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(", ");
                System.out.print(i);
            }
        }
    }
}