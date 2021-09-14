import java.util.Scanner;
class Employee{
    int id;
    String name;
    double salary;

    public static void main(String args[]) {
        Employee k = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String n = sc.nextLine();
        System.out.print("Enter the id : ");
        int i = sc.nextInt();
        System.out.print("Enter the salary : ");
        double s = sc.nextDouble();
        k.setid(i);
        k.setname(n);
        k.setsalary(s);
        System.out.println("Employee Details are : "+k.getemployeedetails());
        System.out.println("How much money you want to withdraw from your salary "+s+" : ");
        int widr = sc.nextInt();
        double sa = k.minimizesalary(widr);
        if(sa == -1)
        {
            System.out.println("Transaction is not possible");
        }
        else
        {
            System.out.println("The remaining amount in your salary : "+sa);
        }
        sc.close();
    }

    String getemployeedetails()
    {
        String details = "\n"+name+"\n"+id+"\n"+salary;
        return details;
    }
    void setid(int i)
    {
        id = i;
    }
    void setname(String n)
    {
        name = n;
    }
    void setsalary(Double s)
    {
        salary = s;
    }
    double minimizesalary(int widr)
    {
        if(widr>salary || widr==salary)
        {
            return -1;
        }
        salary = salary - widr;
        if(salary < 5000)
        {
            return -1;
        }
        return salary;
    }
}