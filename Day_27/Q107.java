package Day_27;

import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String empName[] = new String[10];
        double basicSalary[] = new double[10];
        int count = 0;

        while(true)
        {
            System.out.println("\n----- SALARY MANAGEMENT -----");
            System.out.println("1. Add Employee");
            System.out.println("2. View Salary Details");
            System.out.println("3. Exit");

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

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basicSalary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Successfully");
                    break;

                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Records Found");
                        break;
                    }

                    for(int i = 0; i < count; i++)
                    {
                        double hra = basicSalary[i] * 0.20;
                        double da = basicSalary[i] * 0.10;
                        double totalSalary = basicSalary[i] + hra + da;

                        System.out.println("\nEmployee " + (i + 1));
                        System.out.println("Name: " + empName[i]);
                        System.out.println("Basic Salary: " + basicSalary[i]);
                        System.out.println("HRA: " + hra);
                        System.out.println("DA: " + da);
                        System.out.println("Total Salary: " + totalSalary);
                    }
                    break;

                case 3:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}