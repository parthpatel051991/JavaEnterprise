package in.ineuron.StringAdvance;

import java.util.LinkedHashSet;

class RemoveDuplicatesFromString {
   
    public static String removeDuplicates(String str) {
        // Create a LinkedHashSet to maintain the order of characters
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Iterate over the characters of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Add the character to the set if it's not already present
            set.add(ch);
        }

        // Build the resulting string from the set of unique characters
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
    
 
}

public class RemoveDuplicatesFromStringChecker{
	  public static void main(String[] args) {
	        String input = "Winnipeg";
	        String result = RemoveDuplicatesFromString.removeDuplicates(input);
	        System.out.println("Original string: " + input);
	        System.out.println("String with duplicates removed: " + result);
	    }
}
