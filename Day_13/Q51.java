package Day_13;

import java.util.*;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

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
        
            if (a[i] < smallest) {
                smallest = a[i];
            }

            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("Smallest: " + smallest + "\nLargest: " + largest);
    }
}