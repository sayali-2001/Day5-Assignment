package Example;
import java.util.Scanner;
public class PrintPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        int num1 = sc.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
        }
    }
}
