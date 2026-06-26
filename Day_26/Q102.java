package Day_26;

import java.util.*;

public class Q102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int n = sc.nextInt();

        if (n >= 18) System.out.println("Eligible to Vote");
        else System.out.println("Not Eligible to Vote");
    }
}