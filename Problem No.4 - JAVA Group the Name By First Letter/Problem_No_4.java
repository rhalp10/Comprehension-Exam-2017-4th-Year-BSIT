package problem_no_4;
import java.util.*;

public class Problem_No_4 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] name = new String [10];
    int i, b=0;
    char[] a = new char [10];
    
        System.out.println("Enter 10 names:");
        
        for(i=0; i<10; i++)
        {
            name[i] = input.nextLine();
        }
        
        Arrays.sort(name);
        System.out.println("Result:");
        System.out.println("");
        for(i=0; i<10; i++)
        {
            if(i==0)
            {
                a[b]=name[i].charAt(0);
                System.out.println("");
                System.out.println(Character.toUpperCase(a[b]));
                System.out.println(name[i]);
            }
            else
            {
                if(a[b]!=name[i].charAt(0))
                {
                    b++;
                    a[b] = name[i].charAt(0);
                    System.out.println("");
                    System.out.println(Character.toUpperCase(a[b]));
                    System.out.println(name[i]);
                }
                else
                {
                    System.out.println(name[i]);
                }
            }
        }
    }
}

