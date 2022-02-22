import java.io.*;
import java.util.*;
public class factorialNo
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);
        
    }
}