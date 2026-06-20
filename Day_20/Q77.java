package Day_20;

import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row Size of Matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the Column Size of Matrix 1: ");
        int c1 = sc.nextInt();

        System.out.print("Enter the Row Size of Matrix 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the Column Size of Matrix 2: ");
        int c2 = sc.nextInt();


        if(r1 <= 0 || c1 <= 0 || r2 <= 0 || c2 <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(c1 != r2)
        {
            System.out.println("Matrix Multiplication is not Possible");
            return;
        }

        int x[][] = new int[r1][c1];
        int y[][] = new int[r2][c2];
        int z[][] = new int[r1][c2];

        System.out.println("Enter Elements Row-Wise in Array 1: ");
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c1; j++)
            {
                x[i][j] = sc.nextInt();  
            }   
        }

        System.out.println("Enter Elements Row-Wise in Array 2: ");
        for(int i = 0; i < r2; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                y[i][j] = sc.nextInt();  
            }   
        }

        //Multiplication
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                for(int k = 0; k < c1; k++)
                {
                    z[i][j] += x[i][k] * y[k][j]; 
                }
            }   
        }

        System.out.println("The Multiplication of Matrix 1 and Matrix 2 is: ");
        for(int i = 0; i < r1; i++)
        {
            for(int j = 0; j < c2; j++)
            {
                System.out.print(z[i][j] + " ");
            }
            System.out.println();   
        }
    }
}