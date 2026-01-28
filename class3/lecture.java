//basic functions with no return type and no parameters
//writing a method with argument
//method with return values and no arguments
//method with return values and arguments

package class3;

public class lecture {
    static void sayHello(){
        System.out.println("Hello");
    }
    static void greetUser(String name){
        System.out.println("Hello "+ name);
    }

    static int addNumbers(int a, int b){
        return a + b;
    }

    static boolean isEven(int number){
        return number%2 == 0;
    }

    public static void main(String[] args){
        sayHello();
        greetUser("Alice");
        System.out.println("Sum: " + addNumbers(5, 10));
        System.out.println(isEven(0));
        System.out.println(isEven(7));
    }
    
}

