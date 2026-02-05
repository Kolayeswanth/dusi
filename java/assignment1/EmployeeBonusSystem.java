abstract class Employee {
    private double salary;
    
    public Employee(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public abstract double calculateBonus();
}

class PermanentEmployee extends Employee {
    
    public PermanentEmployee(double salary) {
        super(salary);
    }
    
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
}

class ContractEmployee extends Employee {
    
    public ContractEmployee(double salary) {
        super(salary);
    }
    
    @Override
    public double calculateBonus() {
        return getSalary() * 0.05;
    }
}

public class EmployeeBonusSystem {
    public static void main(String[] args) {
        Employee permanentEmp = new PermanentEmployee(100000);
        Employee contractEmp = new ContractEmployee(100000);
        
        System.out.println("Permanent Employee Bonus: " + permanentEmp.calculateBonus());
        System.out.println("Contract Employee Bonus: " + contractEmp.calculateBonus());
    }
}
