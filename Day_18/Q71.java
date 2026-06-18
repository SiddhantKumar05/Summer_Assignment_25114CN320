package Day_18;

import java.util.*;

public class Q71 {
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

        Arrays.sort(a);

        System.out.println("Enter the Number you want to Search: ");
        int num = sc.nextInt();

        int x = 0;
        int y = n-1;
        int z = -1;
        boolean b = false;

        while(x <= y)
        {
            z = (x+y)/2;
            if(a[z] == num) 
            {
                b = true;
                break;
            }
            else if(num > a[z])
            {
                x = z+1;
            }
            else if(num < a[z])
            {
                y = z-1;
            }
        }

        if(b) System.out.println("The Given Element Exist at Index " + z);
        else System.out.println("The Given Element does not Exist");
    }
}