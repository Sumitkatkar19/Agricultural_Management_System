
import java.util.Scanner;

public class GoatFodderCalculator {

    public static void main(String[] args) {

        // Define the fodder requirements for each age category in kg/day
        double[] greenFodder = {0.5, 1.0, 2.0, 3.0, 2.5, 1.5, 2.0}; // for age categories: 0-3 months, 3-6 months, 6-1yr, above 1 year, pregnant goat, dry goat, boar
        double[] dryFodder = {0.2, 0.4, 0.6, 1.0, 0.8, 0.5, 0.6}; // for age categories: 0-3 months, 3-6 months, 6-1yr, above 1 year, pregnant goat, dry goat, boar

        // Read the number of goats from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of goats: ");
        int numGoats = scanner.nextInt();

        // Calculate the total fodder requirements for all age categories
        double totalGreenFodder = 0;
        double totalDryFodder = 0;
        for (int i = 0; i < greenFodder.length; i++) {
            System.out.print("Enter the number of goats in age category " + i + ": ");
            int numGoatsInCategory = scanner.nextInt();
            totalGreenFodder += numGoatsInCategory * greenFodder[i];
            totalDryFodder += numGoatsInCategory * dryFodder[i];
        }

        // Calculate the total fodder requirements for all goats per day
        double totalGreenFodderPerDay = totalGreenFodder * numGoats;
        double totalDryFodderPerDay = totalDryFodder * numGoats;

        // Output the results
        System.out.println("Total green fodder required per day for " + numGoats + " goats: " + totalGreenFodderPerDay + " kg");
        System.out.println("Total dry fodder required per day for " + numGoats + " goats: " + totalDryFodderPerDay + " kg");
    }
}