/*
Maximum of absolute values
*/

import java.util.*;

public class Task_5 {
    private int numberElements;
    private String numbersSequence;

    // constructor method
    private Task_5(String enteredSequence) {
        numbersSequence = enteredSequence;
    }

    private void work() {
        String[] strEl = numbersSequence.split(" ");
        numberElements = strEl.length;
        System.out.println(Arrays.toString(strEl));
        System.out.println("Number of elements: " + numberElements);
        float[] numEl = new float[strEl.length];
        for (int i = 0; i < strEl.length; i++) {
            if (numEl[i] == (float) numEl[i] || numEl[i] == (int) numEl[i]) {
                numEl[i] = Math.abs(Float.parseFloat(strEl[i]));
            }
        }
        System.out.println(Arrays.toString(numEl));
        float max = numEl[0];
        for (float i  : numEl) {
            max = Math.max(max, i);
        }
/*        for (int i = 0; i < numEl.length; i++) {
            max = Math.max(max, numEl[i]);
        }*/
        System.out.println(max);
    }

/*    public void notAllowed() {
        System.out.println("Not allowed characters entered!");
    }*/

    public static void main(String[] args) {
        System.out.println("Enter Sequence of numbers divided by spaces:");
        Scanner scanSequence = new Scanner(System.in);
        String scannedValue = scanSequence.nextLine();
        Task_5 elements = new Task_5(scannedValue);
        elements.work();
    }
}
