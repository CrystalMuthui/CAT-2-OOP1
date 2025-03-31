// Abstract class 
abstract class Appliance {
    // Abstract method (must be implemented by subclasses)
    abstract void turnOn();
}

// Fan class extends Appliance and implements method turnOn()
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is now spinning.");
    }
}

// TV class extends Appliance and implements method turnOn()
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is now displaying channels.");
    }
}

// Main class 
public class Main {
    public static void main(String[] args) {

        //Objects of subclasses
        Appliance myFan = new Fan();  
        Appliance myTV = new TV();    

        // Calling method turnOn() 
        myFan.turnOn();  
        myTV.turnOn();   
        
    }
}

