package Example;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        int y = sc.nextInt();

        int x1 = x * x;
        int y1 = y * y;

        int sum = x1 + y1;
        double  distance = Math.sqrt(sum);
        System.out.println("Distance Between two points is: " +distance);
    }
}
