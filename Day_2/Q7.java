package Day_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: "); 
        int n = sc.nextInt();
        int num = n;
        int product = 1;
        while(n>0)
        {
            product = product * (n%10);
            n = n/10;
        }
        System.out.println("The product of digits is " + product); 
    }
}
