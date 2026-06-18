package Day_18;

import java.util.Scanner;

public class Q69 {
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

        //Bubble Sort
        for(int i = 0; i < n; i++)
        {
            boolean s = false;
            for(int j = 0; j < n-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    s = true;
                }
            }
            if(s == false) break;
        }

        System.out.println("Array after Bubble Sort: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}