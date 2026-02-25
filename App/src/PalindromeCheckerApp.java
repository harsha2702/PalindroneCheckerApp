import java.util.Scanner;

public class PalindromeUC4 {

    // Method to check palindrome using char array
    public static boolean isPalindrome(String input) {
        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer initialization
        int left = 0;
        int right = chars.length - 1;

        // Compare characters from both ends
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Palindrome
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
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}








