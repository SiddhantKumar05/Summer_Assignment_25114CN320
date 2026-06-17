package Day_17;

import java.util.Scanner;

public class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of 1st Array: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the Size of 2nd Array: ");
        int n2 = sc.nextInt();
        int n3 = n1 < n2 ? n1 : n2;

        if(n1 <= 0 || n2 <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int a[] = new int[n1];
        int b[] = new int[n2];
        int c[] = new int[n3];

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

        int z = 0;
        for(int i = 0; i < n1; i++)
        {
            boolean f = false;
            for(int j = 0; j < n2; j++)
            {
                if(a[i] == b[j])
                {
                    for(int k = 0; k < z; k++)
                    {
                        if(c[k] == a[i]) 
                        {
                            f = true;
                        }   
                    }
                    if (f == false)
                    { 
                        c[z] = a[i];
                        ++z;
                    }
                }
            }
        }

        System.out.println("The Common Elements of 1st and 2nd Array are: ");
        for(int i = 0; i < z; i++)
        {
            System.out.print(c[i] + " ");
        }
    }
}