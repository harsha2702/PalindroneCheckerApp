import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Method to check palindrome using Queue and Stack
    public static boolean isPalindrome(String input) {

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.offer(ch); // enqueue
            stack.push(ch);  // push
        }

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false; // Not a palindrome
            }
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








