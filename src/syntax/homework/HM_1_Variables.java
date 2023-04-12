package syntax.homework;

public class HM_1_Variables {
    /*
    Create a Java program and name it Variables
In your program create different type of variables to store student’s information
(name, last name, grade, city, state, phone number) and then print value of those
variables in the format:
My name is _ and my  last name is __
I am A/B student
I live in city__ and state____
And my phone number is … .
     */
    public static void main(String[] args) {
        String name= "Bartholomew";
        String lastName= "Simpson";
        String grade= "C";
        String city= "Springfield";
        String state= "Springfield State";
        String phoneNumber= "+1 800 EATMYSHORTS";

        System.out.println("My name is " + name + " and my last name is " + lastName);
        System.out.println("I am " + grade + " student");
        System.out.println("I live in city " + city + " and " + state);
        System.out.println("And my phone number is " + phoneNumber);

        /*
        Change student’s city, state, phone number and grade. And print those updated values:
Example: My name is  and I moved to new city and new state__. My new phone number is ___
         */

        city= "The Windy Apple";
        phoneNumber= "+1 800 EATMYSHORTSDUMBASS";
        grade= "C+";

        System.out.println("My name is " + name + " and I moved to new city " + city + " same " + state + ". My new phone number is " + phoneNumber);

    }
}
