package syntax.homework;

import java.util.Scanner;
import java.util.SortedMap;

public class HM_6_BirthSeason {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month.
        Based on the month define the season.
        Example: if user is born in March, April, May → season =”Spring”
        if user is born in June, July, August → season =”Summer”  etc …
        At the end of the program we should see 1 output as “You were born is season __”.

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("What month were you born?");
        String month = scanner.nextLine().toLowerCase();
        String season = "";

        switch (month) {
            case "december":
            case "january":
            case "february":
                season = "Winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "Spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "Summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "Autumn";
                break;
            default:
                System.out.println("Invalid Data");
        }
        System.out.println("You were born in the season of " + season);
    }
}
