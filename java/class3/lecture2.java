//non static methods

package class3;

public class lecture2 {
    int multiplyNumbers(int a, int b){
        subtraction1(1,2);// we can call non static method inside non static method directly
        return a*b;
    }
    static int addition1(int a, int b){
        //subtraction1(3,4); we can't call non static method inside static method directly
        return a+b;
    }
    int subtraction1(int a, int b){
        System.out.println("Inside subtraction method");
        return a-b;
    }
    public static void main(String[] args){
        lecture2 obj = new lecture2();
        System.out.println("Product: " + obj.multiplyNumbers(4, 5));
    }
}