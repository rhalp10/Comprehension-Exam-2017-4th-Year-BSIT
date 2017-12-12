package problem_no_2;
import java.util.*;
public class Problem_No_2 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int i, x, a, b, count=0;
    String result="";
    

        System.out.print("Enter number of rows: ");
        i = input.nextInt();

        System.out.print("Enter X: ");
        x = input.nextInt();
System.out.println("");
        for(a=1; a<=i; a++)
        {
            for(b=1; b<=i; b++)
            {
                if(b*a==x)
                {
                    if(count==0)
                    {
                        result+=a+" x "+b;
                        count++;
                    }
                    else
                    {

                        result+=","+a+" x "+b;
                        count++;
                    }
                    
                }
            }
            
        }

        if(count==0)
        {
            System.out.println("Result: Number "+x+" does not appear in a "+i+"x"+i+" table.");
        }
        else if(count==1)
        {
            System.out.println("Result: Number "+x+" appears "+count+" time in a "+i+"x"+i+" table.");
        }
        else
        {
            System.out.println("Result: Number "+x+" appears "+count+" times in a "+i+"x"+i+" table.");
        }

        if(count==0)
        {

        }
        else if(count==1)
        {
            System.out.println("These is "+result);
        }
        else
        {
            System.out.println("These are "+result);
        }
    }
}
