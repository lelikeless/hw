package GroupProject1;

public class GP_05 {
    public static void main(String[] args) {

        /*
        Write a program to swap 2 numbers without a temporary variable?
         */

        int num1 = 34;
        int num2 = 45;

        System.out.println(num1 + " is assigned to num1 originally");
        System.out.println(num2 + " is assigned to num2 originally");

        System.out.println("Swapping with '+' & '-' operators........");

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping num1 is now " + num1);
        System.out.println("After swapping num2 is now " + num2);

        System.out.println("Swapping back with '*' and '/' operator........");

        num1 = num1 * num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("After swapping num1 is now " + num1);
        System.out.println("After swapping num2 is now " + num2);
    }
}