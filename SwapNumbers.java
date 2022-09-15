package Example;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int temp;

        System.out.println("Before swapping numbers: "+x +"  "+ y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping : "+x +"  "+ y);

    }
}
