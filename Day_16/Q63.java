package Day_16;

import java.util.Scanner;

public class Q63 {
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

        System.out.print("Enter Sum: ");
        int s = sc.nextInt();
        
        int y = 0;
        int z = 0;
        boolean f = false;

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(a[i]+a[j] == s)
                {
                    y = a[i];
                    z = a[j];
                    f = true;
                }
            }
            if(f) break;
        }
        if(f) System.out.println("The Pair whose Sum is " + s + " are " + y + " and " + z);
        else System.out.println("Pair does not Exist");
    }
}