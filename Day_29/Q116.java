package Day_29;

import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int productId[] = new int[10];
        String productName[] = new String[10];
        int quantity[] = new int[10];
        int count = 0;

        while(true)
        {
            System.out.println("\n----- INVENTORY MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count == 10)
                    {
                        System.out.println("Inventory is Full");
                        break;
                    }

                    System.out.print("Enter Product ID: ");
                    productId[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    productName[count] = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = sc.nextInt();

                    count++;

                    System.out.println("Product Added Successfully");
                    break;

                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found");
                        break;
                    }

                    System.out.println("\nProduct Records:");

                    for(int i = 0; i < count; i++)
                    {
                        System.out.println("Product " + (i + 1));
                        System.out.println("Product ID: " + productId[i]);
                        System.out.println("Product Name: " + productName[i]);
                        System.out.println("Quantity: " + quantity[i]);
                    }

                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(productId[i] == searchId)
                        {
                            System.out.println("Product ID: " + productId[i]);
                            System.out.println("Product Name: " + productName[i]);
                            System.out.println("Quantity: " + quantity[i]);

                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Product Record Doesn't Exist");
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