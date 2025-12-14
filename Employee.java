class EmpInfo{
    int empno;
    String empName;
    float sal;

    public EmpInfo() {
        empno = 1001;
        empName = "Shifa";
        sal = 10000;
    }
    public void display(){
        System.out.println(empno+"  |   "+empName+"    |   "+sal);
    }
}
class Employee{
    public static void main(String[] args) {
        EmpInfo emp1 = new EmpInfo();
        EmpInfo emp2 = new EmpInfo();
        EmpInfo emp3 = new EmpInfo();

        emp1.display();
        emp2.display();
        emp3.display();
    }
}