// count the digits in a number
// sum of every digit in a number
//display reverse of the digits
public class Task5 {
    public static void main(String[] args){
        int number = 1231234;
        int count = 0;
        int sum = 0;
        int reverse = 0;

        while(number !=0){
            sum+= number %10;
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
            count++;
        }

        //printing no of digits and sum of digits
        System.out.println("Number of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse of the digits:" + reverse);
    }
    
}
