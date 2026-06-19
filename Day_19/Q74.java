package Day_19;

import java.util.Scanner;

public class Q74 {
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

        int x[][] = new int[r][c];
        int y[][] = new int[r][c];
        int z[][] = new int[r][c];

        System.out.println("Enter Elements Row-Wise in 1st Array: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                x[i][j] = sc.nextInt();    
            }   
        }

        System.out.println("Enter Elements Row-Wise in 2nd Array: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                y[i][j] = sc.nextInt();    
            }   
        }

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                z[i][j] = x[i][j] - y[i][j];    
            }   
        }

        System.out.println("The Difference of Matrix 1 and Matrix 2 is: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(z[i][j] + " ");
            }
            System.out.println();   
        }
    }
}