package GroupProject1;

public class CT04_2dArraySumOfEvenNOdd {
    public static void main(String[] args) {

        /*
        Create a 2D array of integers. Develop a program
        which will calculate the sum of even and odd numbers
        for that array.
         */

        int[][] nums = {
                {44, 55, 67, 86, 45, 23},
                {14, 51, 23, 21, 30, 700},
                {66, 77, 88, 99, 100}
        };

        int sumEven = 0;
        int sumOdd = 0;

        //to get 1d array
        for (int[] arr : nums) {
            for (int i : arr) {
                if (i % 2 == 0) {
                    sumEven += i;
                }

                if (i % 2 != 0) {
                    sumOdd += i;
                }

            }
        }
        System.out.println("The sum of even numbers in 2D array are: " + sumEven);
        System.out.println("The sum odd numbers in 2D array are: " + sumOdd);
    }
}

