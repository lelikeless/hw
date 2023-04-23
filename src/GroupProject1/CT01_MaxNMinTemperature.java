package GroupProject1;

public class CT01_MaxNMinTemperature {
    public static void main(String[] args) {

        /* Analyzing the requirements
        Create a program
        that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the high and low temperature for the week.
         */

        /*
        list of temperature for this week
        Max-Min,Date - Day
        -------------------------------
        56-42, 18-Apr-2023 - Tuesday
        55-36, 19-Apr-2023 - Wednesday
        55-41, 20-Apr-2023 - Thursday
        50-42, 21-Apr-2023 - Friday
        53-40, 22-Apr-2023 - Saturday
        52-38, 23-Apr-2023 - Sunday
        49-35, 24-Apr-2023 - Monday
        * the figures are in Fahrenheit
         */

        int[] maxTemps = {56, 55, 55, 50, 53, 52, 49};
        int[] minTemps = {42, 36, 41, 42, 40, 38, 35};

        int high = 0;
        int low = 1000;

        for (int maxTemp : maxTemps) {
            if (maxTemp > high) {
                high = maxTemp;
            }
        }

        for (int minTemp : minTemps) {
            if (minTemp < low) {
                low = minTemp;
            }
        }

        System.out.println("The maximum fahrenheit is " + high + " for this week.");
        System.out.println("The minimum fahrenheit is " + low + " for this week.");
    }
}
