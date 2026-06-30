package Day_30;

import java.util.Scanner;

public class Q119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId[] = new int[10];
        String empName[] = new String[10];
        double salary[] = new double[10];
        int count = 0;

        while(true)
        {
            System.out.println("\n----- MINI EMPLOYEE MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if(count == 10)
                    {
                        System.out.println("Employee Record is Full");
                        break;
                    }

                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully");
                    break;

                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found");
                        break;
                    }

                    System.out.println("\nEmployee Records:");

                    for(int i = 0; i < count; i++)
                    {
                        System.out.println("Employee " + (i + 1));
                        System.out.println("Employee ID: " + empId[i]);
                        System.out.println("Employee Name: " + empName[i]);
                        System.out.println("Salary: " + salary[i]);
                    }

                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < count; i++)
                    {
                        if(empId[i] == searchId)
                        {
                            System.out.println("Employee ID: " + empId[i]);
                            System.out.println("Employee Name: " + empName[i]);
                            System.out.println("Salary: " + salary[i]);

                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Employee Record Doesn't Exist");
                    }

                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    int index = -1;

                    for(int i = 0; i < count; i++)
                    {
                        if(empId[i] == updateId)
                        {
                            index = i;
                            break;
                        }
                    }

                    if(index == -1)
                    {
                        System.out.println("Employee Record Doesn't Exist");
                    }
                    else
                    {
                        System.out.print("Enter New Salary: ");
                        salary[index] = sc.nextDouble();

                        System.out.println("Salary Updated Successfully");
                    }

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