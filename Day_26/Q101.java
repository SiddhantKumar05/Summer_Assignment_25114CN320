package Day_26;

import java.util.*;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        Random r = new Random();
        int number = r.nextInt(100) + 1;

        int a = 1;

        while(n != number)
        {
            if(n < number) System.out.println("Enter a Bigger Number");
            else System.out.println("Enter a Smaller Number");

            System.out.print("Enter a Number again: ");
            n = sc.nextInt();

            ++a;
        }

        System.out.println("Congratulations! You Guessed the Number");
        System.out.println("You have Guessed the Number in " + a + " attempts");
    }
}