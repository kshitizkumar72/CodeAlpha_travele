import java.util.Scanner;

public class travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for destinations, dates, and preferences
        System.out.println("Welcome to the Travel Itinerary Planner!");
        System.out.print("Enter number of destinations: ");
        int numDestinations = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] destinations = new String[numDestinations];
        for (int i = 0; i < numDestinations; i++) {
            System.out.print("Enter destination " + (i + 1) + ": ");
            destinations[i] = scanner.nextLine();
        }

        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();

        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();

        // Perform calculations and generate itinerary
        System.out.println("Generating itinerary for your trip...");

        // You can include logic here to calculate budget, weather, etc.

        // Display itinerary
        System.out.println("Your Travel Itinerary:");
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("Destinations:");
        for (int i = 0; i < numDestinations; i++) {
            System.out.println((i + 1) + ". " + destinations[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
