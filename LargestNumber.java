package Example;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int x = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        int y = sc.nextInt();

        System.out.println("Enter the Third Number : ");
        int z = sc.nextInt();

        if( x>=y && x>=z){
            System.out.println("The Largest Number is : " +x);
        } else if ( y>=x && y>=z ) {
            System.out.println("The Largest Number is : " +y);
        }else{
            System.out.println("The Largest Number is : " +z);
        }
    }
}
