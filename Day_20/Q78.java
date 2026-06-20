package Day_20;

import java.util.Scanner;

public class Q78 {
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
        boolean b = true;

        System.out.println("Enter Elements Row-Wise in Array: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                x[i][j] = sc.nextInt();  
            }   
        }

        //Symmetry
        for(int i = 0; i < r && b; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(x[i][j] != x[j][i])
                {
                    b = false;
                    break;
                }
            }   
        }
        if(b) System.out.println("The given Matrix is Symmetric");
        else System.out.println("The given Matrix is not Symmetric");
    }
}