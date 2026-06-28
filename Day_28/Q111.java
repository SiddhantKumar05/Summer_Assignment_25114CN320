package Day_28;

import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ticketId[] = new int[10];
        String passengerName[] = new String[10];
        String destination[] = new String[10];

        int count = 0;

        while(true)
        {
            System.out.println("\n----- TICKET BOOKING SYSTEM -----");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count == 10)
                    {
                        System.out.println("Ticket Record is Full");
                        break;
                    }

                    System.out.print("Enter Ticket ID: ");
                    ticketId[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    passengerName[count] = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    destination[count] = sc.nextLine();

                    count++;

                    System.out.println("Ticket Booked Successfully");
                    break;

                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found");
                        break;
                    }

                    System.out.println("\nTicket Records:");

                    for(int i = 0; i < count; i++)
                    {
                        System.out.println("Ticket " + (i + 1));
                        System.out.println("Ticket ID: " + ticketId[i]);
                        System.out.println("Passenger Name: " + passengerName[i]);
                        System.out.println("Destination: " + destination[i]);
                    }

                    break;

                case 3:
                    System.out.print("Enter Ticket ID to Search: ");
                    int searchTicket = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(ticketId[i] == searchTicket)
                        {
                            System.out.println("Ticket ID: " + ticketId[i]);
                            System.out.println("Passenger Name: " + passengerName[i]);
                            System.out.println("Destination: " + destination[i]);

                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Ticket Record Doesn't Exist");
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