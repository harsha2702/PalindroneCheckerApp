import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive method
    public static boolean isPalindrome(String str, int left, int right) {

        // Base condition: pointers crossed or equal
        if (left >= right) {
            return true;
        }

        // If mismatch found
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    // Wrapper method
    public static boolean checkPalindrome(String input) {
        return isPalindrome(input, 0, input.length() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check palindrome
        boolean result = checkPalindrome(input);

        // Output result
        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}








