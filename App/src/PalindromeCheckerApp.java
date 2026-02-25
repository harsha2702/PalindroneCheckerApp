import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Strategy 1 – Stack Based
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : cleaned.toCharArray())
            stack.push(c);

        for (char c : cleaned.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }
}

// Strategy 2 – Deque Based
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : cleaned.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1)
            if (deque.removeFirst() != deque.removeLast())
                return false;

        return true;
    }
}

// Context Class
class PalindromeService {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        if (strategy == null)
            throw new IllegalStateException("Strategy not set!");
        return strategy.check(input);
    }
}

// Main Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.println("=== Strategy Pattern Palindrome ===");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                service.setStrategy(new StackStrategy());
                break;
            case 2:
                service.setStrategy(new DequeStrategy());
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = service.execute(input);

        if (result)
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");

        scanner.close();
    }
}





