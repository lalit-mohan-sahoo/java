import java.util.Scanner;
class Employeedetailed{
String E_name;
int E_ID;
Scanner sc=new Scanner(System.in);
void show(Scanner sc)
{
    System.out.println("enter employee name:");
    E_name=sc.nextLine();
    System.out.println("Employee E_ID:");
    E_ID=sc.nextInt();
    sc.nextLine();
}
void display()
{
    System.out.println("employee name:"+E_name);
    System.out.println("employee ID no:"+E_ID);
}
}
class Department extends Employeedetailed
{
    Scanner sc=new Scanner(System.in);
    String Department_name;
    void show(Scanner sc)
    {
        System.out.println("Enter your department name:");
        Department_name=sc.nextLine();
    }
    void display()
    {
        System.out.println("department:"+Department_name);
    }
}
 class worksection extends Department {
    String section_name;
    Scanner sc=new Scanner(System.in);
    void show(Scanner sc)
    {
       System.out.println("enter section name:");
       section_name=sc.nextLine();
    }
    void display()
    {
        System.out.println("section_name:"+section_name);
    }
    
}
public class Mulitlevel {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        worksection obj=new worksection();
        obj.show(sc);
        obj.show(sc);
        obj.show(sc);
        System.out.println("\n   employee detailed  ");
        obj.display();
        obj.display();
        obj.display();
        sc.close();
    }
}
