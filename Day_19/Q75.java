package Day_19;

import java.util.Scanner;

public class Q75 {
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
        int y[][] = new int[c][r];

        System.out.println("Enter Elements Row-Wise in Array: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                x[i][j] = sc.nextInt();    
            }   
        }

        //Transpose
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                y[j][i] = x[i][j];    
            }   
        }

        System.out.println("The Transpose of the given Matrix is: ");
        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < r; j++)
            {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();   
        }
    }
}