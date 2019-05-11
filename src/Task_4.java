/*The arithmetic mean of positive*/

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanAmount = new Scanner(System.in);
        System.out.println("Enter amount n (0 < n ≤ 100) of real numbers: ");
        int amountNumbers = scanAmount.nextInt();
        if (amountNumbers > 0 && amountNumbers <= 100) {
            float sum = 0;
            int countPositive = 0;
            System.out.println("Enter " + amountNumbers + " positive values:");
            for (int i = 1; i <= amountNumbers; i++) {
                Scanner scanValue = new Scanner(System.in);
                if (scanValue.hasNextFloat()) {
                    float value = scanValue.nextFloat();
                    if (value > 0) {
                        sum = sum + value;
                        countPositive++;
                    }
                } else {
                    System.out.println("Sorry, not number entered!");
                }
            }
            float arithmeticMean = sum / (float) countPositive;
            System.out.println(" The amount of positive numbers is: " +
                    countPositive + " The arithmetic mean of positive numbers is: " + arithmeticMean);

        } else System.out.println("Unacceptable amount of numbers (0 < n ≤ 100)");
    }

}
