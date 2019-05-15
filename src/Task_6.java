/*Twice the minimum*/

public class Task_6 {
    public static void main(String[] args) {
        double[] array = {44.01, 22.1, -33.99, 0, 99, -4.88, -99};
        double min = array[0];
        for (double i : array) {
            min = Math.min(min, i);
        }
        System.out.println("Twice value of minimum element is " + min * 2);


    }
}
