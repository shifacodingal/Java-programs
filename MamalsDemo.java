class Mammals{
    void mamals(){
        System.out.println("Inside Mammals class");
    }
}
class Lion extends Mammals{
    void roar(){
        System.out.println("Inside Lion class");
    }
}
class Human extends Mammals{
    void Hum(){
        System.out.println("Inside Human class.");
    }
}
class MamalsDemo{
    public static void main(String[] args) {
        Human ob = new Human();
        ob.Hum();
        ob.mamals();
    }
}