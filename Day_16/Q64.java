package Day_16;

import java.util.Scanner;

public class Q64 {
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
        int d[] = new int[n];
        int z = 0;

        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();    
        }

        for(int i = 0; i < n; i++)
        {
            boolean b = false;
            for(int k = 0; k < z; k++)
            {
                if(d[k] == a[i]) 
                {
                    b = true;
                }   
            }
            if (b == false)
            { 
                d[z] = a[i];
                ++z;
            }
        }

        System.out.println("Array after Removing Duplicate Elements: ");
        for(int i = 0; i < z; i++)
        {
            System.out.println(d[i]);
        }
    }
}