
import java.util.Scanner;

public class EmployeeSalary{
    public static Employee getEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double salary;

        System.out.println("Enter id : ");
        id = sc.nextInt();

        System.out.println("Enter Name : ");
        name = sc.next();

        System.out.println("Enter Salary : ");
        salary = sc.nextDouble();

        Employee employee = new Employee();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setSalary(salary);
        
        return employee;
    }
    public static int getPFPercentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PF percentage : ");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Employee employee = getEmployeeDetails();
        int pfp = getPFPercentage();
        employee.calculateNetSalary(pfp);

        System.out.println("Id : "+employee.getEmployeeId());
        System.out.println("Name : "+employee.getEmployeeName());
        System.out.println("Salary : "+employee.getSalary());
        System.out.println("Net Salary : "+employee.getNetSalary());
    }
}
class Employee{
    private int id;
    private String name;
    private double salary;
    private double netSalary;

    public int getEmployeeId(){
        return id;
    }
    public void setEmployeeId(int id){
        this.id = id;
    }
    public String getEmployeeName(){
        return name;
    }
    public void setEmployeeName(String name){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getNetSalary(){
        return netSalary;
    }
    public void calculateNetSalary(int pfPercentage){
        double pfAmount = (salary * pfPercentage)/100;
        this.netSalary = salary - pfAmount;
    }
   }