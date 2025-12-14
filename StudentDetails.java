class StudentDetails{
    int Studentid, Age;
    String StudentName;
    
    public StudentDetails() {
        Studentid = 1001;
        StudentName = "Shifa";
        Age = 12;
    }
    public void display(){
        System.out.println(Studentid+"  |   "+StudentName+"   |   "+Age);
    }
    
    public static void main(String[] args) {
        StudentDetails ob = new StudentDetails();
        ob.display();
    }
}