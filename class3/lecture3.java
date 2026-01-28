//simple constructor creation

package class3;

public class lecture3 {
    lecture3(){
        System.out.println("default constructer with no arguments");
    }
    lecture3(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void main(String[] args){
        lecture3 obj = new lecture3();
        lecture3 obj1 = new lecture3(2,12);
    }
    
}


