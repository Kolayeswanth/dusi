// Abstraction is discussed in this class
// Abstraction is a process of hiding the implementation details and showing only functionality to the user
// In java abstraction is achieved using abstract classes and interfaces
// we can not create object of abstract class
// we can create reference variable of abstract class that can point to the object of its subclass which provides the implementation of abstract methods
// abstract class can have abstract methods (without body) and non-abstract methods (with body)
// subclass of abstract class must provide implementation of all abstract methods of abstract class
// if subclass doesn't provide implementation of abstract methods then it must be declared as abstract class itself

abstract class vehicle{
    abstract void start();
    void fuel(){
        System.out.println("Vehicle is refueled");
    }
}

class car extends vehicle{
    void start(){
        System.out.println("Car started with the Key");
    }
    
}

public class lecture3 {
    public static void main(String[] args){
        vehicle v1 = new vehicle() {
            @Override
            void start() {
                System.out.println("Anonymous vehicle started");
            }
        };

        v1.start();
        v1.fuel();
        car myCar = new car();
        myCar.start(); // this will call the start method of car class
        myCar.fuel(); // this will call the fuel method of vehicle class

    }
    
}
