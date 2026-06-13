package Day_13;

import java.util.Scanner;

public class Day_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;

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
        
            if (a[i] % 2 == 0) {
                even = even + 1;
            }

            else {
                odd = odd + 1;
            }
        }

        System.out.println("Even: " + even + "\nOdd: " + odd);
    }
}