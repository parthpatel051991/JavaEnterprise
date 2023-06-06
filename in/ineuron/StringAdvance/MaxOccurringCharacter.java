package in.ineuron.StringAdvance;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char maxChar = findMaxOccurringCharacter(str);

        System.out.println("String: " + str);
        System.out.println("Max occurring character: " + maxChar);
    }

    public static char findMaxOccurringCharacter(String str) {
        int[] charCount = new int[256];

        // Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch]++;
        }

        char maxChar = ' ';
        int maxCount = 0;

        // Find the character with the maximum count
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }
}
