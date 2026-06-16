package Day_16;

import java.util.Scanner;

public class Q61 {
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
        n = n + 1;

        int s1 = (n*(n+1))/2;
        int s2 = 0;

        System.out.println("Enter Elements: ");
        for(int i = 0; i < n-1; i++)
        {
            a[i] = sc.nextInt();
            s2 = s2 + a[i];
        }

        System.out.println("The Missing Number is: " + (s1-s2));
    }
}