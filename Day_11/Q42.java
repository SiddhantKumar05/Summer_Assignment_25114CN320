package Day_11;

import java.util.Scanner;

public class Q42 {
    
    public static int max(int a, int b)
    {
        if (a > b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: "); 
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: "); 
        int n2 = sc.nextInt();

        System.out.println("The Maximum of " + n1 + " and " + n2 + " is " + max(n1, n2));
    }
}