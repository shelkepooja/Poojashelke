import java.io.*;
import java.util.*;
public class permutationCombination{
    public static int fact(int num)
    {
        int fact=1,i;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
        
    }
    public static void main(String args[])
    {
        int n,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n :");
        n=sc.nextInt();
        System.out.println("Enter value of r :");
        r=sc.nextInt();
        
        System.out.print("Combination is "+(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\nPermutation is "+(fact(n)/(fact(n-r))));
    }
}