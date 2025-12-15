class SuperClass{
    int num = 10;
    

}
class SubClass extends SuperClass{
    int num = 20;
    void printNumber(){
        
        System.out.println(num);
        System.out.println(super.num);
    }
}
class SuperDemo{
    public static void main(String[] args) {
        SubClass ob = new SubClass();
    }
}