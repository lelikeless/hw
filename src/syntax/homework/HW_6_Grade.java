package syntax.homework;

import java.util.Scanner;

public class HW_6_Grade {
    public static void main(String[] args) {
        /*
        Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your exam scores");
        int qS= scanner.nextInt();
        int mS= scanner.nextInt();
        int fS= scanner.nextInt();
        int avr= (qS+mS+fS)/3;

        if (avr<=100 && avr>=90){
            System.out.println("A");
        } else if (avr<90 && avr>=70) {
            System.out.println("B");
        } else if (avr<70 && avr>=50) {
            System.out.println("C");
        } else if (avr<50) {
            System.out.println("F");
        }else{
            System.out.println("Error");
        }
    }
}
