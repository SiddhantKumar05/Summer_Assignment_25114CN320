package Day_27;

import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String empName[] = new String[10];
        int empId[] = new int[10];
        double salary[] = new double[10];
        int count = 0;

        while(true)
        {
            System.out.println("\n----- EMPLOYEE MANAGEMENT -----");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

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
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}