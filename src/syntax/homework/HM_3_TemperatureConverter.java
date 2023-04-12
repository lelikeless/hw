package syntax.homework;

import java.util.Scanner;

public class HM_3_TemperatureConverter {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print
        “The temperature is the city  is ”
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your city and temperature °F");
        String city= scanner.next();
        int tempF= scanner.nextInt();
        int tempC= (tempF-32)*5/9;

        System.out.println("The temperature is the city "+city+"  is "+tempC+"°C");
        }
    }
