package Example;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Element : ");
        int arr[][] = new int[3][3];
        for(int i = 0; i< arr.length; i++){

            for(int j = 0; j< arr.length; j++){
                arr[i][j]=sc.nextInt();
//                System.out.println();
            }
        }
        System.out.println("Printing Elements...");
        for(int i = 0; i< arr.length; i++){
            System.out.println();
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j]+"\t");
            }
        }
    }
}
