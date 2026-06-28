package Day_28;

import java.util.Scanner;

public class Q109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bookId[] = new int[10];
        String bookName[] = new String[10];
        String author[] = new String[10];

        int count = 0;

        while(true)
        {
            System.out.println("\n----- LIBRARY MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count == 10)
                    {
                        System.out.println("Library Record is Full");
                        break;
                    }

                    System.out.print("Enter Book ID: ");
                    bookId[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    author[count] = sc.nextLine();

                    count++;

                    System.out.println("Book Added Successfully");
                    break;

                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found");
                        break;
                    }

                    System.out.println("\nBook Records:");

                    for(int i = 0; i < count; i++)
                    {
                        System.out.println("Book " + (i + 1));
                        System.out.println("Book ID: " + bookId[i]);
                        System.out.println("Book Name: " + bookName[i]);
                        System.out.println("Author: " + author[i]);
                    }

                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(bookId[i] == searchId)
                        {
                            System.out.println("Book ID: " + bookId[i]);
                            System.out.println("Book Name: " + bookName[i]);
                            System.out.println("Author: " + author[i]);

                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Book Record Doesn't Exist");
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