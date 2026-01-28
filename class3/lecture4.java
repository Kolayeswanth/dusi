// constructer with arguments

package class3;

public class lecture4 {
    private int n1;
    private int n2;
    lecture4(){
        System.out.println("Object Created");
    }
    lecture4(int n1, int n2){
        this.n1 = n1; // this keyword is used to refer global variables
        this.n2 = n2;
    }
    void display(){
        System.out.println("Number1: "+n1 + " Number2: "+n2);
    }
    public static void main(String[] args){
        lecture4 obj = new lecture4();
        lecture4 obj1 = new lecture4(2,3);
        obj1.display();// assigned values are printed
        obj.display();// defaullt values are printed
    }
    
}
