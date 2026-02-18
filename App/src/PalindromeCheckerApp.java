/*
 * Use Case 2: Print a Hardcoded Palindrome Result
 * Palindrome Checker App
 */

public class PalindromeCheckerApp {

    /*
     * Main Method
     * Entry point of the Java application
     */
    public static void main(String[] args) {

        // Hardcoded string (String Literal stored in String Constant Pool)
        String word = "madam";

        // Display the word being checked
        System.out.println("=====================================");
        System.out.println("Palindrome Checker - UC2");
        System.out.println("=====================================");
        System.out.println("Given Word: " + word);

        // Reverse the string manually
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Conditional statement to check palindrome
        if (word.equals(reversedWord)) {
            System.out.println("Result: \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully.");
    }
}









