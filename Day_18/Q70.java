package Day_18;

import java.util.Scanner;

public class Q70 {
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

        //Selection Sort
        for(int i = 0; i < n; i++)
        {
            int k = i;
            for(int j = i+1; j < n; j++)
            {
                if(a[j] < a[k])
                {
                    k = j;
                }
            }

            int temp = a[i];
            a[i] = a[k];
            a[k] = temp;       
        }

        System.out.println("Array after Selection Sort: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}