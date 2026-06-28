package Day_28;

import java.util.Scanner;

public class Q110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountNo[] = new int[10];
        String name[] = new String[10];
        double balance[] = new double[10];

        int count = 0;

        while(true)
        {
            System.out.println("\n----- BANK ACCOUNT SYSTEM -----");
            System.out.println("1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count == 10)
                    {
                        System.out.println("Account Record is Full");
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    accountNo[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Balance: ");
                    balance[count] = sc.nextDouble();

                    count++;

                    System.out.println("Account Created Successfully");
                    break;

                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found");
                        break;
                    }

                    System.out.println("\nAccount Records:");

                    for(int i = 0; i < count; i++)
                    {
                        System.out.println("Account " + (i + 1));
                        System.out.println("Account Number: " + accountNo[i]);
                        System.out.println("Account Holder Name: " + name[i]);
                        System.out.println("Balance: " + balance[i]);
                    }

                    break;

                case 3:
                    System.out.print("Enter Account Number to Search: ");
                    int searchAccount = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(accountNo[i] == searchAccount)
                        {
                            System.out.println("Account Number: " + accountNo[i]);
                            System.out.println("Account Holder Name: " + name[i]);
                            System.out.println("Balance: " + balance[i]);

                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Account Record Doesn't Exist");
                    }

                    break;

                case 4:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}