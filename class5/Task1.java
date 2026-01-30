
// Write a Java program to find the sum of all the multiples of 3 or 5 below a given number.

class Sum {
    int sum = 0;
    public int Result(int a){
        for(int i = 1; i <= a; i++){
             if(checkDivisibleby3or5(i)){
                sum = sum + i;
             }
        }
        
        return sum;
    }

    boolean checkDivisibleby3or5(int a){
        if(a % 3 == 0 || a % 5 == 0){
            return true;
        }
        return false;
    }


}

public class Task1 {
    public static void main(String[] args){
        Sum obj = new Sum();
        int result = obj.Result(10);
        System.out.println("The sum of all numbers below 10 that are divisible by 3 or 5 is: " + result);
    }
    
}
