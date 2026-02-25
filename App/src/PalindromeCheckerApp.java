import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to normalize string
    public static String normalize(String input) {
        // Remove spaces and convert to lowercase
        return input.replaceAll("\\s+", "").toLowerCase();
    }

    // Palindrome check using two-pointer
    public static boolean isPalindrome(String input) {

        String cleaned = normalize(input);

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check palindrome
        boolean result = isPalindrome(input);

        // Output result
        if (result) {
            System.out.println("The given string is a Palindrome (Ignoring spaces & case).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}








