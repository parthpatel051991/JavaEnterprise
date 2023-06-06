package in.ineuron.StringAdvance;

import java.util.Scanner;

class CharacterCounter{
   
	public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
	
	public static void characterCounts(String n){
		 int vowelCount = 0;
	        int consonantCount = 0;
	        int specialCharCount = 0;

	        for (int i = 0; i < n.length(); i++) {
	            char ch = Character.toLowerCase(n.charAt(i));

	            if (Character.isLetter(ch)) {
	                if (isVowel(ch)) {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            } else {
	                specialCharCount++;
	            }
	        }

	        System.out.println("String: " + n);
	        System.out.println("Vowel count: " + vowelCount);
	        System.out.println("Consonant count: " + consonantCount);
	        System.out.println("Special character count: " + specialCharCount);
	}
}




public class CharacterCounterSolution {
    public static void main(String[] args) {
       
    	Scanner sc = new Scanner(System.in);
    	try {

			System.out.print("Enter the String to counts characters ::");
			String n = sc.nextLine();

			CharacterCounter.characterCounts(n);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
    }
}

