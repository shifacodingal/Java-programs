class Animal{
    public void Dog(){
        System.out.println("IT barks ...");
    }
    public void Dog(String Food){
        System.out.println("It eats : "+Food);
    }
}
class Pets extends Animal{
    public void Dog(){
        System.out.println("Loyal pet.");
    }
}
class MethodOverloadOverride{
    public static void main(String[] args) {
        Pets ob = new Pets();
        ob.Dog();
    }
}
