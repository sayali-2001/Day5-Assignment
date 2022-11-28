package Example;
import java.util.Scanner;
public class PrintPower {
    public static void main(String[] args) {
         int power = 6;
         for (int i=1; i<= power; i++){
             System.out.println("2 raised to " +i+ " is " +Math.pow(2, i));
         }

    }
}
