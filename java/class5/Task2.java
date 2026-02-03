// Write a program to find the difference between the sum of the squares and the square of the sums of the first n natural numbers.

import java.util.Scanner;

class Diff{
    int result(int a){
        int sumOfSquares = 0;
        int squareOfSum = 0;
        sumOfSquares = sumOfSquares(a);
        squareOfSum = squareOfSum(a);

        return squareOfSum - sumOfSquares;
    }

    int sumOfSquares(int a){
        int sumOfSquares = 0;
        for(int i=1; i<=a; i++){
            sumOfSquares += i*i;
        }
        return sumOfSquares;
    }


    int squareOfSum(int a){
        int sum = 0;
        for(int i=1; i<=a; i++){
            sum += i;
        }
        return sum*sum;
    }
}

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = sc.nextInt();
        Diff obj = new Diff();
        System.out.println("Result is :" + obj.result(number));

        sc.close();
    }
    
}
