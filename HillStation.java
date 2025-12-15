class VisitLocation{
    void location(){
        System.out.println("Location is : ");
    }
    void famousfor(){
        System.out.println("Famous for : ");
    }
}
class Manali extends VisitLocation{
    void location(){
        System.out.println("Manali is in Himachal Pradesh.");
    }
    void famousfor(){
        System.out.println("It is Famous for Hadimba Temple.");
    }
}
class Mussoorie extends VisitLocation{
    void location(){
        System.out.println("Mussoorie is in Uttarakhand.");
    }
    void famousfor(){
        System.out.println("It si Famous education institute.");
    }
}
class Gulmarg extends VisitLocation{
    void location(){
        System.out.println("Gulmarg is in Jammu and Kashmir");
    }
    void famousfor(){
        System.out.println("It is famous for skiing");
    }
}
class HillStation{
    public static void main(String[] args) {
        VisitLocation ob =  new VisitLocation();
        VisitLocation ob1 = new VisitLocation();

        ob.location();
        ob.famousfor();

    }
}