import java.util.*;
public class Array {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    int sum[][]=new int[10][10];
    int mult[][]=new int[10][10];
    System.out.println("Enter the size of the rows and columns of the first matrix");
    int r1=sc.nextInt();
    int c1=sc.nextInt();

    System.out.println("Enter the elements for the first matrix");
    for(int i=0;i<c1;i++)
    {
        for(int j=0;j<r1;j++)
        {
            a[i][j]=sc.nextInt();
        }
        System.out.println("\n");
    }
    System.out.println("Enter the size of the rows and columns of the Second matrix");
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    System.out.println("Enter the elements for the second matrix");
    for(int i=0;i<c2;i++)
    {
        for(int j=0;j<r2;j++)
        {
            b[i][j]=sc.nextInt();
        }
        System.out.println("\n");
    }
    if((r1==r2)&&(c1==c2))
    {
    for(int i=0;i<c2;i++)
    {
        for(int j=0;j<r2;j++)
        {
            sum[i][j]=a[i][j]+b[i][i];
        }}}
        else
        {
        System.out.println("The Result is undefined for the addition of matrix");
        }
        if(c1==r2)
        {
            for(int i=0;i<c2;i++)
            {
                for(int j=0;j<r1;j++)
                {
                    mult[i][j]=a[i][j]*b[j][i];
                }}
        System.out.println("The resultant Matrix from the Multiplication is :\n");
        
        for(int i=0;i<c2;i++)
            {
                for(int j=0;j<r1;j++)
                {
                    System.out.print(mult[i][j] );
                }
            System.out.println("\n");}}
sc.close();
}}