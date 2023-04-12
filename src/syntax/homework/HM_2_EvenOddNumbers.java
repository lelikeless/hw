package syntax.homework;

public class HM_2_EvenOddNumbers {
    public static void main(String[] args) {
        /*
    Write a program to check whether number is positive or negative.
    Write a Java Program to check whether number is Even or Odd.
        */

        int num= 776;

        if (num> 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        if (num%2== 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
