package Day_06;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int num = n;
        String b = "";
        
        if(n == 0)
        {
            System.out.println("0");
            return;
        }

        while(num > 0)
        {
            b = b + num%2;
            num = num/2;
        }
        
        for(int i = b.length()-1; i >=0; i--)
        {
            System.out.print(b.charAt(i));
        }
    }
}