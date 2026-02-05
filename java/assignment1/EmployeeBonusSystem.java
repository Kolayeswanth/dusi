// Abstract Employee class demonstrating abstraction and encapsulation
abstract class Employee {
    // Private variable to demonstrate encapsulation
    private double salary;
    
    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }
    
    // Getter method for salary (encapsulation)
    public double getSalary() {
        return salary;
    }
    
    // Setter method for salary (encapsulation)
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract double calculateBonus();
}

// PermanentEmployee subclass
class PermanentEmployee extends Employee {
    
    public PermanentEmployee(double salary) {
        super(salary);
    }
    
    // Implementing abstract method - Permanent employees get 20% bonus
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
}

// ContractEmployee subclass
class ContractEmployee extends Employee {
    
    public ContractEmployee(double salary) {
        super(salary);
    }
    
    // Implementing abstract method - Contract employees get 5% bonus
    @Override
    public double calculateBonus() {
        return getSalary() * 0.05;
    }
}

// Main class demonstrating runtime polymorphism
public class EmployeeBonusSystem {
    public static void main(String[] args) {
        // Runtime polymorphism - parent class reference holding child class objects
        Employee permanentEmp = new PermanentEmployee(100000);
        Employee contractEmp = new ContractEmployee(100000);
        
        // Polymorphic method calls
        System.out.println("Permanent Employee Bonus: " + permanentEmp.calculateBonus());
        System.out.println("Contract Employee Bonus: " + contractEmp.calculateBonus());
    }
}
