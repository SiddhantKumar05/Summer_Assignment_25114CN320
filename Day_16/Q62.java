package Day_16;

import java.util.Scanner;

public class Q62 {
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
        
        int f = 0;
        int e = 0;

        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            int z = 0;
            for(int j = 0; j < n; j++)
            {
                if(a[i] == a[j]) ++z;
            }
            if(z > f)
            {
                e = a[i];
                f = z;
            }
        }

        System.out.println("The Maximum Frequency Element is " + e);
    }
}