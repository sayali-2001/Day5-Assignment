package Example;

import java.util.Scanner;
import java.util.Random;

public class FlipCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTimeCoinFlipped = sc.nextInt();
        int tails =0;
        int heads = 0;
        for (int i = 1; i < noOfTimeCoinFlipped ; i++) {
            double randomValue = Math.random();
            if(randomValue < 0.5){
                tails++;
            }
            else {
                heads++;
            }
            
        }
        int tailsPercentage = tails * 100 / noOfTimeCoinFlipped;
        int headsPercentage = heads * 100 / noOfTimeCoinFlipped;
        System.out.println("Tails Percentage " +tailsPercentage);
        System.out.println("Heads Percentage " +headsPercentage);
    }
}
