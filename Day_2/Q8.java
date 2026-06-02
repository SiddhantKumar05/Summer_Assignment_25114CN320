package Day_2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: "); 
        int n = sc.nextInt();
        int num = n;
        int reverse = 0;
        while(n>0)
        {
            reverse = (reverse*10) + n%10;
            n = n/10;
        }

        if(num == reverse)
        {
            System.out.println("Palindrome Number"); 
        }
        else
        {
            System.out.println("Not a Palindrome Number"); 
        }
    }
}
