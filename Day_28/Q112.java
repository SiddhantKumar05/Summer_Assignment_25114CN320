package Day_28;

import java.util.Scanner;

public class Q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[10];
        String phone[] = new String[10];
        int count = 0;

        while(true)
        {
            System.out.println("\n----- CONTACT MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count == 10)
                    {
                        System.out.println("Contact Record is Full");
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Enter Contact Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phone[count] = sc.nextLine();

                    count++;

                    System.out.println("Contact Added Successfully");
                    break;

                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found");
                        break;
                    }

                    System.out.println("\nContact Records:");

                    for(int i = 0; i < count; i++)
                    {
                        System.out.println("Contact " + (i + 1));
                        System.out.println("Name: " + name[i]);
                        System.out.println("Phone Number: " + phone[i]);
                    }

                    break;

                case 3:
                    sc.nextLine();

                    System.out.print("Enter Phone Number to Search: ");
                    String searchPhone = sc.nextLine();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(phone[i].equals(searchPhone))
                        {
                            System.out.println("Name: " + name[i]);
                            System.out.println("Phone Number: " + phone[i]);

                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Contact Record Doesn't Exist");
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