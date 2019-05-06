/*The first is not greater for 2,5*/

public class Task_2 {
    public static void main(String[] args) {
        double arr[] = {12, 22.33, 111.222, 44.33, 2.7,2.1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 2.5) {
                System.out.println(arr[i]);
                break;
            }
            if (i == arr.length - 1) {
                System.out.println("Not found");
            }

        }
    }
}
