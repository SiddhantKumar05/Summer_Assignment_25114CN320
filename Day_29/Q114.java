package Day_29;

import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        int n = 0;

        while(true)
        {
            System.out.println("\n----- ARRAY OPERATIONS SYSTEM -----");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Find Maximum Element");
            System.out.println("4. Find Minimum Element");
            System.out.println("5. Search Element");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Number of Elements: ");
                    n = sc.nextInt();

                    if(n <= 0 || n > 10)
                    {
                        System.out.println("Invalid Size");
                        break;
                    }

                    System.out.println("Enter Elements:");

                    for(int i = 0; i < n; i++)
                    {
                        a[i] = sc.nextInt();
                    }

                    System.out.println("Elements Inserted Successfully");
                    break;

                case 2:
                    if(n == 0)
                    {
                        System.out.println("Array is Empty");
                        break;
                    }

                    System.out.println("Array Elements:");

                    for(int i = 0; i < n; i++)
                    {
                        System.out.print(a[i] + " ");
                    }

                    System.out.println();
                    break;

                case 3:
                    if(n == 0)
                    {
                        System.out.println("Array is Empty");
                        break;
                    }

                    int max = a[0];

                    for(int i = 1; i < n; i++)
                    {
                        if(a[i] > max)
                        {
                            max = a[i];
                        }
                    }

                    System.out.println("Maximum Element: " + max);
                    break;

                case 4:
                    if(n == 0)
                    {
                        System.out.println("Array is Empty");
                        break;
                    }

                    int min = a[0];

                    for(int i = 1; i < n; i++)
                    {
                        if(a[i] < min)
                        {
                            min = a[i];
                        }
                    }

                    System.out.println("Minimum Element: " + min);
                    break;

                case 5:
                    if(n == 0)
                    {
                        System.out.println("Array is Empty");
                        break;
                    }

                    System.out.print("Enter Element to Search: ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for(int i = 0; i < n; i++)
                    {
                        if(a[i] == search)
                        {
                            System.out.println("Element Found at Index " + i);
                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Element Not Found");
                    }

                    break;

                case 6:
                    System.out.println("Thank You");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}