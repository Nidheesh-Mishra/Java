import java.util.*;
class Minutes_to_year
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int min;
        System.out.println("Enter the Minutes");
        min = sc.nextInt();
        if((min>1440)&&(min>=528480))
        System.out.println("Years: "+min/528480+"\nDays: "+(min%528480)/1440);
        else if((min<528480)&&(min>1440))
        System.out.println("Days:"+min/1440);
        else
        System.out.println("The no. of Minutes is too less");
        sc.close();
    }
}
