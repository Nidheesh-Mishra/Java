import java.util.*;
class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a NUmber to be Checked");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            int r=n%i;
            if(r==0)
            c++;
        }
        if(c>2)
        System.out.println("The Number "+n+" is not a Prime Number");
        else
        System.out.println("The Number "+n+" is a Prime Number");
    }
}