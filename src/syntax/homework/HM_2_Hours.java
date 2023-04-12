package syntax.homework;

public class HM_2_Hours {
    public static void main(String[] args) {
        /*
        Create Java program to store 2 values for expected and actual hours.
        Your program should check if expected hours are more than actual the program
        should print “You will love the course and you will succeed”, otherwise
        “Course will be very hard for you!”
        */

        int expHours= 1000;
        int actHours= 100;

        if (expHours>actHours){
            System.out.println("You will love the course and you will succeed");
        }else{
            System.out.println("Course will be very hard for you((");
        }
    }
}
