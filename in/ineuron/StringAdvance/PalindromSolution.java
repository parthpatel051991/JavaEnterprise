package in.ineuron.StringAdvance;

class PalindromeChecker {

	public static boolean checkPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}
}

public class PalindromSolution {

	public static void main(String[] args) {
		String str = "2552";

		boolean isPalindrome = PalindromeChecker.checkPalindrome(str);

		if (isPalindrome) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}
	}
}
