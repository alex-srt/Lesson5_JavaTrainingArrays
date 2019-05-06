/*Those that are divided into 6*/

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,888,99,0,3,44,55};
        int sum = 0;
        int elCounter = 0;
        for (int i : arr) {
            if (i>0 && i%6 ==0) {
                sum+= i;
                elCounter++;
            }
        }
        System.out.println("Sum of elements " + sum);
        System.out.println("# of elements " + elCounter);
    }
}
