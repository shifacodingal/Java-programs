// Class for Cube

class Cube {

    private double side;   


    public void setSide(double side) {
        this.side = side;
    }

    
    public double getSide() {
        return side;
    }

    
    public double calculateVolume() {
        return side * side * side;
    }
}


class Cuboid {

    private double length, width, height;

    
    public void setDimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    
    public double calculateVolume() {
        return length * width * height;
    }
}


public class VolumeCalculation {

    public static void main(String[] args) {

        
        Cube cube = new Cube();
        cube.setSide(5);
        System.out.println("Volume of Cube = " + cube.calculateVolume());

        
        Cuboid cuboid = new Cuboid();
        cuboid.setDimensions(4, 3, 2);
        System.out.println("Volume of Cuboid = " + cuboid.calculateVolume());
    }
}
