package Day_30;

import java.util.Scanner;

public class Q120 {

    static String itemName[] = {"Burger", "Pizza", "Coffee", "Sandwich", "Pasta"};
    static int price[] = {50, 120, 20, 50, 100};
    static int quantity[] = new int[5];

    public static void showMenu()
    {
        System.out.println("\n----- RESTAURANT MENU -----");

        for(int i = 0; i < itemName.length; i++)
        {
            System.out.println((i + 1) + ". " + itemName[i] + " - Rs." + price[i]);
        }
    }

    public static void placeOrder(Scanner sc)
    {
        showMenu();

        System.out.print("Enter Item Number: ");
        int choice = sc.nextInt();

        if(choice < 1 || choice > 5)
        {
            System.out.println("Invalid Item");
            return;
        }

        System.out.print("Enter Quantity: ");
        int q = sc.nextInt();

        quantity[choice - 1] += q;

        System.out.println("Order Placed Successfully");
    }

    public static void generateBill()
    {
        int total = 0;

        System.out.println("\n----- BILL -----");

        for(int i = 0; i < itemName.length; i++)
        {
            if(quantity[i] > 0)
            {
                int amount = quantity[i] * price[i];

                System.out.println(
                    itemName[i] + " x " +
                    quantity[i] + " = Rs." +
                    amount
                );

                total += amount;
            }
        }

        System.out.println("----------------");
        System.out.println("Total Bill = Rs." + total);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n----- RESTAURANT ORDERING SYSTEM -----");
            System.out.println("1. Show Menu");
            System.out.println("2. Place Order");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    showMenu();
                    break;

                case 2:
                    placeOrder(sc);
                    break;

                case 3:
                    generateBill();
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