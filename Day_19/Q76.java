package Day_19;

import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row Size: ");
        int r = sc.nextInt();
        System.out.print("Enter the Column Size: ");
        int c = sc.nextInt();

        if(r <= 0 || c <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(r != c)
        {
            System.out.println("Matrix must be Square");
            return;
        }

        int x[][] = new int[r][c];
        int d = 0;

        System.out.println("Enter Elements Row-Wise in Array: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                x[i][j] = sc.nextInt();  
                if(i == j) d = d + x[i][j];  
            }   
        }

        System.out.println("The Sum of Principal Diagonal of the given Matrix is: " + d);
    }
}