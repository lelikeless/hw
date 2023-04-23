package GroupProject1;

public class GP_02 {
    public static void main(String[] args) {

        /* Requirement Analysis
        Create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
         */

        int[] nums = {45, 67, 34, 65, 87, 34, 78, 54, 12};

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        System.out.println("Sum of all stored elements in the array is " + sum + ".");


    }
}
