package GroupProject1;

public class GP_10 {
    public static void main(String[] args) {

        /*
        Write a program to print out duplicate elements from
        an Array of Strings?
         */

        String[] names = {"Egor", "Margiela", "Zhanna", "German", "Daniil", "EEgor", "Alexey", "German", "Vlad"};

        System.out.println("The duplicate elements are: ");
        System.out.println("---------------------------");

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if ((names[i].equals(names[j])) && (j != i)) {
                    System.out.print(names[j] + " ");
                }
            }
        }
    }
}
