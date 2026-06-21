package Day_21;

import java.util.Scanner;

public class Q83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        int c = 0;
        int v = 0;

        for(int i = 0; i < s.length(); i++) 
        {
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ++v;
            else if(Character.isLetter(ch)) ++c;
        }

        System.out.println("Consonants: " + c + "\nVowels: " + v);
    }
}