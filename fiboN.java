import java.io.*;
import java.util.*;
public class fiboN
{
    public static void main(String args[])
    {
         int i,c=0,n;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a number to generate fibonacci series upto nth term :: ");
         n=sc.nextInt();
         int a=0;
         int b=1;
         
         System.out.println("Fibonacci Series upto "+n+" is :-");
         while(c<=n)
         {
             System.out.print(c+" ");
             a=b;
             b=c;
             c=a+b;
         }
         
         
    
    }
}