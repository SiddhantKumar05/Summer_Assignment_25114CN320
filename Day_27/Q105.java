package Day_27;

import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[10];
        int roll[] = new int[10];
        double marks[] = new double[10];
        int count = 0;

        while(true)
        {
            System.out.println("\n----- STUDENT RECORD MANAGEMENT -----");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count == 10)
                    {
                        System.out.println("Student Record is Full");
                        break;
                    }

                    System.out.print("Enter Roll Number: ");
                    roll[count] = sc.nextInt();

                    sc.nextLine();
                    
                    System.out.print("Enter Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextDouble();

                    count++;
                    System.out.println("Student Added Successfully");
                    break;

                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found");
                        break;
                    }

                    System.out.println("\nStudent Records:");

                    for(int i = 0; i < count; i++)
                    {
                        System.out.println("Student " + (i+1));
                        System.out.println("Roll No: " + roll[i]);
                        System.out.println("Name: " + name[i]);
                        System.out.println("Marks: " + marks[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(roll[i] == searchRoll)
                        {
                            System.out.println("Roll No: " + roll[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);

                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Student Record Doesn't Exist");
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