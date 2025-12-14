class StaticCounter{
    static int number=10;
    void increament(){
        number = number + 1;
    }
    public static void main(String[] args) {
        StaticCounter ob1 = new StaticCounter();
        StaticCounter ob2 = new StaticCounter();
        StaticCounter ob3 = new StaticCounter();

        ob1.increament();
        ob2.increament();
        ob3.increament();

        System.out.println(ob1.number);
        System.out.println(ob2.number);
        System.out.println(ob3.number);
    }
}