package GroupProject1;

public class CT09_2ndLargestNum {
    public static void main(String[] args) {

        /*
        Write a java program to find the second largest
        number in the array?
         */

        int[] nums = {34, 56, 23, 56, 12, 78, 57, 45};

        int max = 0;
        int max2nd = 0;

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (max != num && num > max2nd) {
                max2nd = num;
            }
        }

        System.out.println(max2nd);
    }
}
