package in.ineuron.StringAdvance;

import java.util.Arrays;
import java.util.Scanner;

class AnagramChecker {

	public static void isAnagram(String n, String n1) {

		n = n.toLowerCase();
		n1 = n1.toLowerCase();

		System.out.println(n);
		System.out.println(n1);

		char[] a = new char[n.length()];
		char[] b = new char[n1.length()];

		if (n.length() != n1.length()) {
			System.out.println("Strings are not Anagram");
		} else {
			a = n.toCharArray();
			b = n1.toCharArray();

			Arrays.sort(a);
			Arrays.sort(b);

			if (Arrays.equals(a, b)) {

				System.out.println("Strings Are Anagram.");

			} else {
				System.out.println("Strings are not Anagram");
			}

		}

	}

}

public class AnagramSolution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String 1 ::");
		String n = sc.nextLine();

		System.out.print("Enter String 2 ::");
		String n1 = sc.nextLine();

		AnagramChecker.isAnagram(n, n1);

	}
}
