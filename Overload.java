class student{
    int id;
    String name;
    float stipent;

    public student() {
    }

    public student(int id, String name, float stipent) {
        this.id = id;
        this.name = name;
        this.stipent = stipent;
    }

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(this.id+"  |  "+this.name+"  |  "+this.stipent);
    }
}
class Overload{
    public static void main(String[] args) {
        student ob = new student();
        student ob1 = new student(10, "Shifa");
        student ob2 = new student(11, "ABC", 20000);

        ob.display();
        ob1.display();
        ob2.display();
    }
}