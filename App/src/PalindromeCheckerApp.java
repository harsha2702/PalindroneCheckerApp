/*
 * Use Case 1: Application Entry & Welcome Message
 * Palindrome Checker App
 */

public class PalindromeCheckerApp {

    // Static constants for application details
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0";

    /*
     * Main Method
     * Entry point of the Java application
     * JVM automatically invokes this method
     */
    public static void main(String[] args) {

        // Application Startup Flow
        displayWelcomeMessage();

        // Flow control – Ready to proceed to next use case
        System.out.println();
        System.out.println("Application initialized successfully.");
        System.out.println("Proceeding to next use case...");
    }

    // Method to display welcome information
    private static void displayWelcomeMessage() {
        System.out.println("===========================================");
        System.out.println("        Welcome to " + APP_NAME);
        System.out.println("               " + APP_VERSION);
        System.out.println("===========================================");
        System.out.println("This application validates whether a");
        System.out.println("given string is a palindrome.");
    }
}








