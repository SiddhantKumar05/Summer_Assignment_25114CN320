package Day_25;

import java.util.Scanner;

public class Q100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        s = s + " ";
        
        int n = 0;
        int k = 0;
        String w = "";

        String a[] = new String[s.length()];
        int b[] = new int[s.length()];

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != ' ') 
            {
                ++n;
                w = w + s.charAt(i);
            }

            else
            {
                a[k] = w;
                b[k] = n;
                ++k;
                w = "";
                n = 0;
            } 
        }

        //Selection Sort
        for(int i = 0; i < k; i++)
        {
            int z = i;
            for(int j = i+1; j < k; j++)
            {
                if(b[j] < b[z])
                {
                    z = j;
                }
            }

            int t1 = b[i];
            b[i] = b[z];
            b[z] = t1;   
            
            String t2 = a[i];
            a[i] = a[z];
            a[z] = t2;   
        }

        System.out.println("Words Sorted by Length: ");
        for(int i = 0; i < k; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}