package Day_29;

import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        while(true)
        {
            System.out.println("\n----- STRING OPERATIONS SYSTEM -----");
            System.out.println("1. Find Length");
            System.out.println("2. Reverse String");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Count Vowels");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Length of String: " + s.length());
                    break;

                case 2:
                    String r = "";

                    for(int i = s.length() - 1; i >= 0; i--)
                    {
                        r = r + s.charAt(i);
                    }

                    System.out.println("Reversed String: " + r);
                    break;

                case 3:
                    String u = "";

                    for(int i = 0; i < s.length(); i++)
                    {
                        char ch = s.charAt(i);

                        if(ch >= 'a' && ch <= 'z')
                        {
                            ch = (char)(ch - 32);
                        }

                        u = u + ch;
                    }

                    System.out.println("Uppercase String: " + u);
                    break;

                case 4:
                    int vowels = 0;

                    for(int i = 0; i < s.length(); i++)
                    {
                        char ch = Character.toLowerCase(s.charAt(i));

                        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        {
                            vowels++;
                        }
                    }

                    System.out.println("Number of Vowels: " + vowels);
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