package Day_15;

import java.util.Scanner;

public class Day_57 {
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

        int y = 0;
        int z = a.length-1;
        while(y<z)
        {
            int temp = a[y];
            a[y] = a[z];
            a[z] = temp;
            ++y;
            --z;
        }
        
        System.out.println("\nArray in Reverse Order: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}