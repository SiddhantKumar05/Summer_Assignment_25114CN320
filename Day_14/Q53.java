package Day_14;

import java.util.Scanner;

public class Q53 {
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

        System.out.println("Enter the Number you want to search: ");
        int s = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < n; i++)
        {
            if (a[i] == s) {
                found = true;
            }
        }

        if (found) 
        {
            System.out.println("Element Exist");
        }
        else 
        {
            System.out.println("Element does not Exist");
        }
    }
}