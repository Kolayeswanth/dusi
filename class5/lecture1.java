// Types of inheritence is discussed in this class
// different types of inheritence java is accepting is discussed in this class
// java supports single level multi level, hybrid and hierarchical inheritence
// java doesn't support multiple inheritence to avoid ambiguity problem when a class inherits from two classes having same methods then when we call the constructer from child class it will get into ambiguity to call which parent class constructor so to avoid this problem java doesn't support multiple inheritence

// method overloading and overriding is also discussed in this class
// below code is related to overloading and overriding concept


class A {
    void show(){
        System.out.println("Class A show method called");
    }
}

class B extends A {
    void show(){
        System.out.println("Class B show method called");
    }
    void display(){
        System.out.println("Class B display method called");
    }
}

public class lecture1 {
    public static void main(String[] args){
        // creating object of class B
        B objB = new B();
        objB.show(); // this will call the show method of class B due to method overriding
        objB.display(); // this will call the display method of class B

        // creating object of class A
        A objA = new A();
        objA.show(); // this will call the show method of class A
    
}

}