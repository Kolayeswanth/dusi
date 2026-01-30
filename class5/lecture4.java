// interface doesn't contain constructer but abstract class can have constructer
// in interface we can declare only abstract methods (without body) but in abstract class we can have both abstract methods and non-abstract methods (with body)
// a class can implement multiple interfaces but can extend only one abstract class
// for interface when we implement it to child class when we defining the method then we have to give public access specifier to the method otherwise it will give error because by default interface methods are public and abstract so while implementing we have to give public access specifier to the method
// in abstract class while overriding the abstract method we can give any access specifier to the method as per our requirement
// multiple inheritence is achieved using interfaces in java


abstract class Animal{
    abstract void play();
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

// interface class contains only method declarations without body
interface Pet{
    void play();
}

class Cat implements Pet{
    public void play(){
        System.out.println("Cat plays with yarn");
    }
}

interface Humans{
    void play();
}


// multiple inheritence is achieved using interfaces in java
class a implements Humans, Pet{
    public void play(){
        System.out.println("Human plays football");
    }
}

// a class can extend only one abstract class but can implement multiple interfaces
class Dog extends Animal implements Pet, Humans{
    public void play(){
        System.out.println("Dog plays fetch");
    }
}

public class lecture4 {
    public static void main(String[] args){
        Dog myDog = new Dog();
        myDog.sound(); // this will call the sound method of Animal class
        myDog.play(); // this will call the play method of Dog class

        Cat myCat = new Cat();
        myCat.play(); // this will call the play method of Cat class
    }
}
