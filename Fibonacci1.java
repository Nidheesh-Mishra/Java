import java.util.*;
class Fibonacci1
{
    int fib(int x)
    {
        if(x==1)
        {
        return 0;
        }
        else if(x==2)
        {
        return 1;
        }
        else
        {
        return (fib(x-1))+(fib(x-2));
        }
    }
    
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms of the series");
        int n=sc.nextInt();
        Fibonacci1 ob=new Fibonacci1();
        for(i=1;i<=n;i++)
        {
         System.out.print(ob.fib(i));
        }
        sc.close();
    }
}