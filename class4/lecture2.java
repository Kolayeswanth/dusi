// lecture1 continution part is written here
// using getter and setter methods to access private fields of a class from outside the class.
// without these methods, the private fields would be inaccessible from other classes.

package class4;

public class lecture2 {
    public static void main(String[] args){
        lecture1 person = new lecture1();
        person.setName("alex");
        person.setAge(13);
        // person.setAddress("India");

        // lecture3 continution part written here
        lecture3 addr = new lecture3();
        addr.setHouseNo(12);
        addr.setStreet("main street");
        addr.setCity("new york");
        addr.setCountry("USA");
        // address object is set to person object
        person.setAddress(addr);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        // System.out.println("Address: " + person.getAddress());
        System.out.println("Addres: "+person.getAddress().getHouseNo()+" "+person.getAddress().getStreet()+" "+
        person.getAddress().getCity()+" "+person.getAddress().getCountry());
    }
    
}
 