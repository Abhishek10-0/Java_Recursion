package Level1;

public class Palidrome{

    public static void main(String[] args) {
        String str = "madam";
        boolean result = isPalindrome(str, 0, str.length() - 1);
        System.out.println("Is Palindrome? " + result);
    }

    static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start crosses end, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If characters don't match, it's not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call inward
        return isPalindrome(str, start + 1, end - 1);
    }
}

