public class Calculator{
    public static void main(String [] args){
        // Arithmetic operations
        Arithmetic arith = new Arithmetic();
        arith.performOperations();

        // Comparison operations
        Comparison comp = new Comparison();
        comp.compareValues();

        // Logical operations
        Logical logic = new Logical();
        logic.evaluateLogic();

        // Increment and Decrement operations
        incrementAndDecrement incDec = new incrementAndDecrement();
        incDec.demonstrate();

        // Conditional statements
        conditional cond = new conditional();
        cond.checkEligibility();
    }
}

class Arithmetic {
    int a = 15;
    int b = 25;

    public void performOperations(){
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (b - a));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (float)(b / a));
        System.out.println("Modulus: " + (b % a));
    }
}

class Comparison{
    int x = 5;
    int y = 10;

    public void compareValues(){
        System.out.println("Is x less than y? " + (x<y));
        System.out.println("Is x greater than y? " + (x>y));
        System.out.println("Is x equal to y? " + (x==y));
        System.out.println("Is x not equal to y? " + (x!=y));
    }
    
}

class Logical{
    boolean p = true;
    boolean q = false;

    public void evaluateLogic(){
        System.out.println("p AND q: " + (p && q));
        System.out.println("p OR q: " + (p || q));
        System.out.println("NOT p: " + (!p));
    }
}

class incrementAndDecrement{
    int num = 10;
    int value = num++ + ++num + num-- + --num + num;

    public void demonstrate(){
        System.out.println("Original number: " + num);
        System.out.println("Post-increment: " + (num++));
        System.out.println("After post-increment: " + num);
        System.out.println("Pre-increment: " + (++num));
        System.out.println("After pre-increment: " + num);
        System.out.println("Post-decrement: " + (num--));
        System.out.println("After post-decrement: " + num);
        System.out.println("Pre-decrement: " + (--num));
        System.out.println("After pre-decrement: " + num);
        System.out.println("Final computed value: " + value);
    }
}

class conditional{
    int age = 20;

    void checkEligibility(){

        //compilation error
        // if (1) {
        //     System.out.println("This condition is always true.");
            
        // } 

        if(age < 0){
            System.out.println("Invalid age.");
        }
        
        if(age >= 18){
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        if(age < 13){
            System.out.println("Child");
        } else if(age >= 13 && age < 20){
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
    }
}