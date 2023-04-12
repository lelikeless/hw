package syntax.homework;

import java.util.Scanner;

public class HM_6_DefineNumbers {
    public static void main(String[] args) {
        /*
        Ask user to enter a number and then define if number is small, medium or large
        Small number is value between 1 and 10
        Medium number is value between 11 and 100
        Large number is value between 101 and 1000
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scanner.nextInt();

        if (num<11){
            System.out.println("Small");
        } else if (num<101) {
            System.out.println("Medium");
        } else if (num<1001){
            System.out.println("Large");
        }else{
            System.out.println("Wrong number");
        }
    }
}
