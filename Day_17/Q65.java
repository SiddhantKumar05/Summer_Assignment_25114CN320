package Day_17;

import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of 1st Array: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Size of 2nd Array: ");
        int n2 = sc.nextInt();

        if(n1 <= 0 || n2 <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int a[] = new int[n1];
        int b[] = new int[n2];
        int c[] = new int[n1+n2];

        System.out.println("Enter Elements in 1st Array: ");
        for(int i = 0; i < n1; i++)
        {
            a[i] = sc.nextInt();    
        }

        System.out.println("Enter Elements in 2nd Array: ");
        for(int i = 0; i < n2; i++)
        {
            b[i] = sc.nextInt();    
        }


        for(int i = 0; i < (n1+n2); i++)
        {
            if(i < n1)
            {
                c[i] = a[i];
            }
            else
            {
                c[i] = b[i-n1];
            }
        }

        System.out.println("The Merged Array:");
        for(int i = 0; i < (n1+n2); i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}