package in.ineuron.StringAdvance;

class UniqueCharacters{

    public static boolean checkUniqueCharacters(String str) {
    	boolean[] charSet = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            int charValue = str.charAt(i);

            // If the character has been encountered before, it is not unique
            if (charSet[charValue]) {
                return false;
            }

            // Mark the character as encountered
            charSet[charValue] = true;
        }

        return true;
    }
}

public class UniqueCharactersChecker {
    public static void main(String[] args) {
        String str = "Hello";
        
        boolean hasUniqueCharacters = UniqueCharacters.checkUniqueCharacters(str);

        if (hasUniqueCharacters) {
            System.out.println(str + " contains all unique characters.");
        } else {
            System.out.println(str + " does not contain all unique characters.");
        }
    }
}
