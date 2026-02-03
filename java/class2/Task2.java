//calculate sume of even and sum of odd index values in an array
//also calculate average of even and odd index values in an array

public class Task2 {
    public static void main(String[] args){
        int[] numbers = {10,21,32,43,54,65,76,87,98};
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0){
                evenSum += numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }
        //print sums
        System.out.println("Sum of even index values: " + evenSum);
        System.out.println("Sum of odd index values: " + oddSum);

        //print average of even index values
        System.out.println("Average of even index values: " + (evenSum / (numbers.length / 2 + numbers.length % 2)));
        //print average of odd index values
        System.out.println("Average of odd index values: " + (oddSum / (numbers.length / 2)));
        
    }
    
}