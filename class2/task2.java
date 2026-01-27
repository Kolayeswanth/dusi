//calculate sume of even and sum of odd index values in an array

public class task2 {
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

        System.out.println("Sum of even index values: " + evenSum);
        System.out.println("Sum of odd index values: " + oddSum);

    }
    
}
