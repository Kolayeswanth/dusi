//inheritence part is written here

package class4;

public class lecture4 extends lecture1{
    lecture4(){
        System.out.println("lecture4 class constructor called");
    }
    private String role;
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }

    
}
