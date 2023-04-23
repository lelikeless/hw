package GroupProject1;

public class GP_03 {
    public static void main(String[] args) {

        /* Analysis of requirement
        Create a 2D array of integer type
            where you will store odd and even numbers.
        Develop a program which
            will identify/print the even numbers only.
         */

        int[][] nums = {
                {44, 55, 67, 86, 45, 23},
                {14, 51, 23, 21, 30, 700},
                {66, 77, 88, 99, 100}
        };

        System.out.println("The even numbers in 2D array are:");

        for (int[] arr : nums) {

            for (int i : arr) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
