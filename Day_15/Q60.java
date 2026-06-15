package Day_15;

import java.util.Scanner;

public class Q60 {
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
        int b[] = new int[n];

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

        int j = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] != 0)
            {
                b[j] = a[i];
                ++j;
            }
        }

        System.out.println("Zeroes at the End: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(b[i] + " ");
        }
    }
}