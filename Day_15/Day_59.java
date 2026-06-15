package Day_15;

import java.util.Scanner;

public class Day_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        
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

        System.out.println("Array: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }

        int temp = a[n-1];
        for(int i = n-1; i >= 1; i--)
        {
            a[i] = a[i-1];
        }
        a[0] = temp;
        
        System.out.println("\nArray Rotated Right: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}