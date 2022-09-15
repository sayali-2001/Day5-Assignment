package Example;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
//        int arr[]={3,-1,-7,-4 ,-5 ,9, -4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter values in an array");
        for (int i = 0; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< arr.length; i++){
            int firstNumber = arr[i];
            for(int j=i+1; j< arr.length; j++){
                int secondNumber = arr[j];
                for(int k=j+1; k< arr.length; k++){
                    int thirdNumber = arr[k];
                    int sum = firstNumber + secondNumber + thirdNumber;
                    if( sum==0 ){
                        System.out.println(firstNumber+ " , " +secondNumber+ " , " +thirdNumber);
                    }
                }
            }
        }
    }
}
