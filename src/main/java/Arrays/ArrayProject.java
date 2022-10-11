package Arrays;

import java.util.Scanner;

public class ArrayProject {
    Scanner scan = new Scanner(System.in);

    public void userInput() {
        System.out.println("How many day's temperatures? ");
        int noOfDays = scan.nextInt();
        int[] temps = new int[noOfDays];
        // record temperatures and find average
        int sum = 0;
        for (int i = 0; i < noOfDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = scan.nextInt();
            sum += temps[i];
        }
        double average = sum / noOfDays;
        // count days above average
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average temp = " + average);
        System.out.println(above + " days above average");
    }
}
