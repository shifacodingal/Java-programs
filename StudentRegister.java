// Java Program to Display Student Details Using Object

class Student {

    // Data members
    int rollNo;
    String name;
    String course;

    // Method to assign values
    void setDetails(int r, String n, String c) {
        rollNo = r;
        name = n;
        course = c;
    }

    // Method to display values
    void displayDetails() {
        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
    }
}

public class StudentDemo {

    public static void main(String[] args) {
        // Creating an object of Student class
        Student s1 = new Student();

        // Assigning values to the object
        s1.setDetails(101, "Rahul", "B.Tech CSE");

        // Displaying student details
        s1.displayDetails();
    }
}
