import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }

    public static boolean checkPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return checkPalindrome(str.substring(1, str.length() - 1));
        }

        return false;
    }
}