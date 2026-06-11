package Day_11;

import java.util.Scanner;

public class Q41 {
    
    public static int sum(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: "); 
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: "); 
        int n2 = sc.nextInt();

        System.out.println("The Sum of " + n1 + " and " + n2 + " is " + sum(n1, n2));
    }
}