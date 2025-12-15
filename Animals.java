class Animal{
    void eat(){
        System.out.println("Eating .... ");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Roar ....");
    }
}
class BabyLion extends Lion{
    void weep(){
        System.out.println("Weeping ....");
    }
}
class Animals{
    public static void main(String[] args) {
        BabyLion ob = new BabyLion();
        ob.eat();
        ob.roar();
        ob.weep();
    }
}