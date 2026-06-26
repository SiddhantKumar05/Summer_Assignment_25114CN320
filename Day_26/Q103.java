package Day_26;

import java.util.Scanner;

public class Q103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        while(true)
        {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            int amount;

            switch(choice)
            {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter Amount to Deposit: ");
                    amount = sc.nextInt();
                    balance = balance + amount;
                    System.out.println("Updated Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter Amount to Withdraw: ");
                    amount = sc.nextInt();
                    if (amount > balance) 
                    {
                        System.out.print("Insufficient Balance");
                        break;
                    }
                    balance = balance - amount;
                    System.out.println("Updated Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank You for Using ATM");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}