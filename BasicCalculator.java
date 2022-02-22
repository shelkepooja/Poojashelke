import java.io.*;
import java.util.*;
public class BasicCalculator
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Value of First Number :: ");
        a=sc.nextInt();
        System.out.print("Enter Value of Second Number :: ");
        b=sc.nextInt();
        
        System.out.println("\n================================================");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplycation");
        System.out.println("Enter 4 for Division");
        System.out.println("================================================\n");
        System.out.print("Enter your choice :: ");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Addition of given Number :"+(a+b));
                break;
                
            case 2:
                System.out.println("Subtraction of the given Number :"+(a-b));
                break;
                
            case 3:
                System.out.println("Multiplycation of the given Number :"+(a*b));
                break;
            
            case 4:
                System.out.println("Division of the given Number :"+(a/b));
                break;
                
                default:
                System.out.println("Please Enter valied Number");
                    
                
                
        }
    }
}