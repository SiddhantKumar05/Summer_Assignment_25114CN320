package Day_03;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: "); 
        int n = sc.nextInt();
        int d = 0;
        
        if (n <= 1) 
        {
            System.out.println("Not a Prime Number");
            return;
        }       
        
        for(int i = 2; i <= n; i++)
        {
            if (n%i == 0) 
            {
                d = d + 1;
            }
        }

        if(d == 1)
        {
            System.out.println("Prime Number"); 
        }
        else
        {
            System.out.println("Not a Prime Number"); 
        }
    }    
}