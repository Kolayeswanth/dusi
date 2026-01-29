// defining getter and setter methods is a common practice in Java to provide controlled access to the fields of a class.
// This approach encapsulates the fields, allowing validation and other logic to be implemented within these methods.
// The continution part of lecture1.java is writter in lecture2.java

package class4;
public class lecture1 {
    private String name;
    private int age;
    private lecture3 address;// because lecture3 class having definition of address fields

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(lecture3 address){
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public lecture3 getAddress(){
        return this.address;
    }
}