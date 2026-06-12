package Day_12;

import java.util.Scanner;

public class Q48 {
    public static void fibonacci(int n)
    {
        int a = 0;
        int b = 1;
        int c;

        System.out.print("0, 1");

        for(int i = 1; i <= n-2; i++)
        {
            System.out.print(", ");
            c = a + b;
            a = b;
            b = c;
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        if(n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(n == 1)
        {
            System.out.println("0");
            return;
        }

        fibonacci(n);
    }
}