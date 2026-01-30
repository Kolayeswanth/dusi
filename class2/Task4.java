// printing tables in java

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its table:");
        int num = sc.nextInt();
        System.out.println("Table of " + num + " is:");
        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        } 
        sc.close();  
    }
    
}
