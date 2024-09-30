package bank;

import java.util.Scanner;

public class GeoPoliticalZonesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;
        GeoPoliticalZone politicalZone = null;

        System.out.println("Enter a geopolitical zone in Nigeria to view its states: ");
        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            System.out.println("- " + zone.name());
        }

        while(!isValidInput) {
            System.out.println("Enter a geopolitical zone in Nigeria: ");
            String userInput = scanner.nextLine();

            userInput = userInput.toUpperCase().replaceAll("[\\s ]", "_");

            try {
                politicalZone = GeoPoliticalZone.valueOf(userInput);
                isValidInput = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid geopolitical zone: " + userInput);
            }
        }

        System.out.println("\nThe States in " +politicalZone.name() + " are: " );
        for (String states : politicalZone.getStates()) {
            System.out.println(states);
        }
    }
        private static String formatZoneName(String zoneName) {
            return zoneName.replaceAll("([A-Z])", "$1").trim().replace("CENTRAL", "Central").replace("EAST", "East").replace("WEST", "West").replace("SOUTH", "South").replace("NORTH", "North");
        }
    }