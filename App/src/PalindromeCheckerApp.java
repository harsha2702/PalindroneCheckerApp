import java.util.Scanner;

// Service class responsible for palindrome logic
class PalindromeChecker {

    // Public method exposed to user
    public boolean checkPalindrome(String input) {

        // Preprocessing (optional enhancement)
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Internal data structure (char array)
        char[] chars = cleaned.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// Main class for execution
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(input);

        // Display result
        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}







