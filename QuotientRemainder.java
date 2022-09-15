package Example;

import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();

        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Quotient When "  + a +  "/" + b +  " is : " +quotient);
        System.out.println("Remainder When "  + a +  "%" + b +  " is : " +remainder);
    }
}
