package class1;
// Simple ATM withdrawal simulation demonstrating conditional statements in Java.
// first check for correct PIN, then check for sufficient balance before allowing withdrawal.

public class Task1 {
    public static void main(String[] args) {
        int balance = 10000;
        int withdrawAmount = 3000;
        int enteredPIN = 1234;
        int actualPIN = 1234;

        // Check PIN
        if(enteredPIN == actualPIN){
            // check sufficient balance
            if(withdrawAmount <= balance){
                balance -= withdrawAmount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        }
        else {
            System.out.println("Incorrect PIN.");
        }
    }
    
}
