import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Reverse
    static boolean reverseCheck(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }

    // Method 2: Two Pointer
    static boolean twoPointerCheck(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (Character.toLowerCase(s.charAt(l)) !=
                    Character.toLowerCase(s.charAt(r)))
                return false;
            l++; r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine().replaceAll("\\s+", "");

        long t1 = System.nanoTime();
        boolean r1 = reverseCheck(input);
        long t2 = System.nanoTime();

        long t3 = System.nanoTime();
        boolean r2 = twoPointerCheck(input);
        long t4 = System.nanoTime();

        System.out.println("\nReverse Method: " + (t2 - t1) + " ns | " + r1);
        System.out.println("Two Pointer:    " + (t4 - t3) + " ns | " + r2);

        sc.close();
    }
}





