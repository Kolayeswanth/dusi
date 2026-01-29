// getter and setter methods for a class representing an address with fields for house number, street, city, and country.
// This class encapsulates the address details and provides controlled access through its methods.
// defining getter and setter methods is a common practice in Java to provide controlled access to the fields of a class.
// This approach encapsulates the fields, allowing validation and other logic to be implemented within these methods
// continution part of lecture3.java is writter in lecture4.java

package class4;

public class lecture3 {
    private int houseNo;
    private String Street;
    private String city;
    private String country;

    public void setHouseNo(int houseNo){
        this.houseNo = houseNo;
    }
    public void setStreet(String Street){
        this.Street = Street;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCountry(String country){
        this.country = country;
    }


    public int getHouseNo(){
        return this.houseNo;
    }
    public String getStreet(){
        return this.Street;
    }
    public String getCity(){
        return this.city;
    }
    public String getCountry(){
        return this.country;
    }
}