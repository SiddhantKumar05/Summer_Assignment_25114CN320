package Day_14;

import java.util.Scanner;

public class Q56 {
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
            for(int j = 0; j < n; j++)
            {
                if (a[i] == a[j] && i != j) 
                {
                    boolean b = false;
                    for(int k = 0; k < z; k++)
                    {
                        if(d[k] == a[j]) 
                        {
                            b = true;
                        }
                    }
                    if (b == false)
                    { 
                        d[z] = a[j];
                        ++z;
                    }
                }
            }
        }

        System.out.print("The Duplicate Elements are: ");
        for(int i = 0; i < z; i++)
        {
            System.out.println(d[i]);
        }
    }
}