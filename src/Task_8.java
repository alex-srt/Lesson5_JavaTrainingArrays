/*Negative elements
https://www.e-olymp.com/en/problems/921

The sequence of n real numbers is given. Find the sum and the number of negative elements in it.
Input

The first line contains the number n (n ≤ 100) of sequence elements. In the next line n real numbers - the elements of sequence are given. Their values do not exceed 100 by absolute value.
Output

Print in one line the number of negative elements and their sum with two digits after the decimal point.*/

public class Task_8 {
    public static void main(String[] args) {
        double[] array = {6, -7.5, 2.1, -2.0, 0};
        int negativeNumbers = 0;
        double negativeSum = 0.00;
        for (double i : array) {
            if (i<0){
                negativeNumbers++;
                negativeSum = negativeSum +i ;
            }
        }
        System.out.println("Number of negative elements: " + negativeNumbers + " Sum of negative elements: " + negativeSum);
    }
}
