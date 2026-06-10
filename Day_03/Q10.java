package Day_03;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number: "); 
        int n1 = sc.nextInt();
        System.out.print("Enter Ending Number: "); 
        int n2 = sc.nextInt();
        int d = 0;
        
        for(int i = n1; i <= n2; i++)
        {
            if(i <= 1)
            {
                continue;
            }

            d = 0;

            for(int j = 2; j <= i; j++)
            {
                if (i%j == 0) 
                {
                    d = d + 1;
                }

            }
            
            if(d == 1)
            {
                System.out.println(i); 
            }
        }
    }
}