class Parent{
    int age, id;
    String name;
    void naming(String name){
        System.out.println("Name : "+name);
    }
}
class child extends  Parent{
    void Age(int age){
        System.out.println("Age : "+age);
    }
  
}
class Student{
    public static void main(String[] args) {
        child ob = new child();
        ob.naming("Shifa");
        ob.Age(23);
    }
}