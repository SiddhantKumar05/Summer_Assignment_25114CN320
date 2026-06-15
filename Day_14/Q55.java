package Day_14;

import java.util.Scanner;

public class Q55 {
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

        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++)
        {
            if (a[i] > l) {
                s = l;
                l = a[i];
            }
            else if(a[i] > s && a[i] != l)
            {
                s = a[i];
            }
        }

        if (s != Integer.MIN_VALUE) 
        {
            System.out.println("Second Largest Element is " + s);
        }
        else 
        {
            System.out.println("Second Largest Element does not Exists");
        }
    }
}