//atm using methods for deposit, withdraw, check balance

package class3;

public class Task1 {
    double balance;
    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds. Current balance: " + balance);
        } else if(amount > 0){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    void checkBalance(){
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args){
        Task1 atm = new Task1();
        atm.balance = 1000; // initial balance 1000
        atm.checkBalance();
        atm.deposit(500);
        atm.withdraw(200);
        atm.checkBalance();
        atm.withdraw(2000); // trying to withdraw more than balance
    }
    
}
