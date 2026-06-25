package Day_25;

import java.util.Arrays;
import java.util.Scanner;

public class Q099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Names: ");
        int n = sc.nextInt();
        
        if(n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        String a[] = new String[n];

        System.out.println("Enter Names: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.next();    
        }

        Arrays.sort(a);

        System.out.println("Names Sorted Alphabetically:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}