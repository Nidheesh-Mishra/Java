import java.util.*;
public class Switch_Case {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice: \n");
    System.out.println("1: if u wan to Add");
    System.out.println("2: if u wan to Subtract");
    System.out.println("3: if u wan to Multiply");
    System.out.println("4: if u wan to Divide");
    int choice=sc.nextInt();
    switch(choice)
    {
        case 1 :
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum is :"+ (a+b));
        break;

        case 2 :
        System.out.println("Enter two numbers");
         a=sc.nextInt();
         b=sc.nextInt();
        System.out.println("The Result of Subtraction is :"+ (a-b));
        break;

        case 3 :
        System.out.println("Enter two numbers");
         a=sc.nextInt();
         b=sc.nextInt();
        System.out.println("The Result of Multiplication is :"+ (a*b));
        break;

        case 4 :
        System.out.println("Enter two numbers");
         a=sc.nextInt();
         b=sc.nextInt();
        System.out.println("The Result of Division is :"+ (a/b));
        break;

        default : System.out.println("Invalid Input");

    }
sc.close();
}}