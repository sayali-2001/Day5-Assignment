package Example;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int x = sc.nextInt();

        if( x%2 == 0){
            System.out.println(x+ " is Even Number");
        }else {
            System.out.println(x+ " is Odd Number");
        }
    }
}
