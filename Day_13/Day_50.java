package Day_13;

import java.util.Scanner;

public class Day_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        double sum = 0;
        double average;

        if(n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        int a[] = new int[n];

        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            sum = sum + a[i];
        }

        average = sum/n;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}