package Day_26;

import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int ans;

        System.out.println("Q1. Capital of India?");
        System.out.println("1. Delhi");
        System.out.println("2. Mumbai");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter Answer: ");
        ans = sc.nextInt();

        if(ans == 1) ++score;

        System.out.println("\nQ2. Which language is used for Android Development?");
        System.out.println("1. Python");
        System.out.println("2. Java");
        System.out.println("3. C");
        System.out.println("4. HTML");
        System.out.print("Enter Answer: ");
        ans = sc.nextInt();

        if(ans == 2) ++score;

        System.out.println("\nQ3. 2 + 2 = ?");
        System.out.println("1. 3");
        System.out.println("2. 5");
        System.out.println("3. 4");
        System.out.println("4. 6");
        System.out.print("Enter Answer: ");
        ans = sc.nextInt();

        if(ans == 3) ++score;

        System.out.println("\nQ4. Which data type stores decimal values?");
        System.out.println("1. int");
        System.out.println("2. char");
        System.out.println("3. boolean");
        System.out.println("4. double");
        System.out.print("Enter Answer: ");
        ans = sc.nextInt();

        if(ans == 4) ++score;

        System.out.println("\nQ5. Which company created Java?");
        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Google");
        System.out.println("4. Apple");
        System.out.print("Enter Answer: ");
        ans = sc.nextInt();

        if(ans == 2) ++score;

        System.out.println("\nFinal Score: " + score + "/5");
    }
}