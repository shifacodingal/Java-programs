abstract class Obj{
    abstract void showShape();
    public void Shape(){
        System.out.println("I m form abstrac class");
    }
}
class Sphere extends Obj{
    void showShape(){
        System.out.println("Object type is Sphere");
    }
}

class Cuboid extends Obj{
    void showShape(){
        System.out.println("Object type is Cuboid");
    }
}

class Object{
    public static void main(String[] args) {
        Obj ob = new Sphere();
        ob.showShape();
        
    }
}