package Day_20;

import java.util.Scanner;

public class Q79 {
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

        System.out.println("Enter Elements Row-Wise in Array: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                x[i][j] = sc.nextInt();  
            }   
        }

        //Row-Wise Sum
        for(int i = 0; i < r; i++)
        {
            int s = 0;
            for(int j = 0; j < c; j++)
            {
                s = s + x[i][j];
            }
            System.out.println("The Sum of Row " + (i+1) + " is: " + s);
        }
    }
}