package in.ineuron.StringAdvance;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class DuplicatesFromString {
   
    public static void printDuplicates(String str) {
        // Create a LinkedHashSet to maintain the order of characters
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        List<Character> list = new ArrayList<>();

        // Iterate over the characters of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Add the character to the set if it's not already present
           if(!set.add(ch)) {
        	  list.add(ch);
           }
        }
        
        System.out.println("Duplicates from String :: ");
        list.forEach(System.out::println);

    }
    
 
}

public class PrintDuplicatesFromString{
	  public static void main(String[] args) {
	        String input = "Winnipeg";
	        DuplicatesFromString.printDuplicates(input);

	    }
}
