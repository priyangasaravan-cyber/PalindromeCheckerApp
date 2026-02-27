import java.util.Scanner;

public class PalindromeCheckerApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalindromeService service = new PalindromeService();

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean isPalindrome = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}


class PalindromeService {

    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}