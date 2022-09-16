package Example;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num1 = sc.nextInt();
        System.out.println("Factors of " +num1+ " are : ");
        for (int i = 1; i <= num1; i++) {
            // if number is divided by i
            // i is the factor
            if (num1 % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
