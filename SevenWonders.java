
class Wonder {

    void display() {
        System.out.println("Seven Wonders of the World");
    }
}

// Child classes
class TajMahal extends Wonder {

    void display() {
        System.out.println("Taj Mahal - India");
    }
}

class GreatWall extends Wonder {

    void display() {
        System.out.println("Great Wall of China - China");
    }
}

class Petra extends Wonder {

    void display() {
        System.out.println("Petra - Jordan");
    }
}

class Colosseum extends Wonder {

    void display() {
        System.out.println("Colosseum - Italy");
    }
}

class ChichenItza extends Wonder {

    void display() {
        System.out.println("Chichen Itza - Mexico");
    }
}

class MachuPicchu extends Wonder {

    void display() {
        System.out.println("Machu Picchu - Peru");
    }
}

class ChristRedeemer extends Wonder {

    void display() {
        System.out.println("Christ the Redeemer - Brazil");
    }
}

// Main class
public class SevenWonders {

    public static void main(String[] args) {

        // Polymorphism: parent reference, child object
        Wonder[] wonders = {
            new TajMahal(),
            new GreatWall(),
            new Petra(),
            new Colosseum(),
            new ChichenItza(),
            new MachuPicchu(),
            new ChristRedeemer()
        };

        for (Wonder w : wonders) {
            w.display();   // calls overridden method
        }
    }
}
