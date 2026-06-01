package Day_1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: "); 
        int n = sc.nextInt();
        int num = n;
        int digits = 0;
        while(n>0)
        {
            digits++;
            n = n/10;
        }
        System.out.println("The number of digits in " + num + " is " + digits); 
    }  
}
