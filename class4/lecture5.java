// lecture4 continution part is writtern here
// using getter and setter methods to access private fields of a class from outside the class.
// without these methods, the private fields would be inaccessible from other classes.
// in lecture4 we are written a class which is inherited from lecture1 class
// in lecture1 class we have name, age and address fields and adress field is defined in lecture3 class
// in lecture4 class we are adding a new field role with its getter and setter methods
// in lecture5.java we will create an object of lecture4 class and set all the fields including inherited ones
// and print them to demonstrate inheritance and encapsulation

package class4;
public class lecture5 {
    public static void main(String[] args){
        //  creating object of lecture4 class to access inherited methods
        lecture4 emp = new lecture4();
        emp.setRole("HR");
        
        // creating object of lecture3 class to set address for employee
        lecture3 empAddr = new lecture3();
        empAddr.setHouseNo(45);
        empAddr.setStreet("2nd street");
        empAddr.setCity("los angeles");
        empAddr.setCountry("USA");

        // attaching address object to employee object using inherited method
        emp.setAddress(empAddr);

        // setting name and age for the inherited variable which came to lecture4 from lecture1
        emp.setName("John");
        emp.setAge(30);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Role: " + emp.getRole());
        System.out.println("Employee Address: " + emp.getAddress().getHouseNo() + " " +
        emp.getAddress().getStreet() + " " + emp.getAddress().getCity() + " " + emp.getAddress().getCountry());  
        
    }
}
