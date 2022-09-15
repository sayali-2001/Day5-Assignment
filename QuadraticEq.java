package Example;

import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value of a : ");
        double a = sc.nextInt();

        System.out.println("Enter the Value of b : ");
        double b = sc.nextInt();

        System.out.println("Enter the Value of c : ");
        double c = sc.nextInt();

        double root1 = 0;
        double root2 = 0;
        double delta = b*b-4*a*c;
        if(delta>0){
            root1 = (-b+Math.sqrt(delta))/(2*a);
            root2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("The roots are Real and Distinct");
            System.out.println("Root1 : " +root1);
            System.out.println("Root2 : " +root2);
        } else if (delta == 0) {
            root1 = -b/(2*a);
            root2 = -b/(2*a);
            System.out.println("The roots are Real and Equal");
            System.out.println("Root1 : " +root1);
            System.out.println("Root2 : " +root2);
        }else {
            System.out.println("The roots are imaginary");
        }
    }
}
