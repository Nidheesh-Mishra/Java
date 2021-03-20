class Employee
{
    public void Employee1()
    {
        System.out.println("Rohit Sharma\t\t\t1993\t\t\t60,000\t\t\t123/c MG road Delhi-78\n");
    }
    public void Employee2()
    {
        System.out.println("Virat Kohli\t\t\t1997\t\t\t80,000\t\t\t456/f charkarmar road Delhi-152\n");
    }
    public void Employee3()
    {
        System.out.println("Sachin Tendulkar\t\t1987\t\t\t1,00,000\t\t546/d Dhinchak road Mumbai-87\n");
    }
    public static void main(String[] args) {
        Employee ob=new Employee();
        System.out.println("Name\t\t\t Year of Joining\t\tSalary\t\t\t    Address\t\t\t ");
        ob.Employee1();
        ob.Employee2();
        ob.Employee3();

    }
}