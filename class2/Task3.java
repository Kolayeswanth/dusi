//take user input and print the elements in the array in the reverse order

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size; i++){
            System.out.print("Enter element " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }

        //print elements in reverse order
        System.out.print("Elements in reverse order:");
        for(int i = size-1; i >=0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
