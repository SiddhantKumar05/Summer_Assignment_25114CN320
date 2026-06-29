package Day_29;

import java.util.Scanner;

public class Q113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n----- MENU DRIVEN CALCULATOR -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter First Number: ");
                    double a = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    double b = sc.nextDouble();

                    System.out.println("Result: " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    a = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    b = sc.nextDouble();

                    System.out.println("Result: " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    a = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    b = sc.nextDouble();

                    System.out.println("Result: " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    a = sc.nextDouble();

                    System.out.print("Enter Second Number: ");
                    b = sc.nextDouble();

                    if(b == 0)
                    {
                        System.out.println("Division by Zero is not Possible");
                        break;
                    }

                    System.out.println("Result: " + (a / b));
                    break;

                case 5:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}