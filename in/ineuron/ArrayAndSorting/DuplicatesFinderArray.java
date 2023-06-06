package in.ineuron.ArrayAndSorting;

import java.util.Arrays;
class findDuplicates{	
	
	public static void DuplicatesFinder(int[] array) {
		Arrays.sort(array);
		
		boolean foundDuplicates = false;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				if (!foundDuplicates) {
					System.out.print("Duplicates: ");
					foundDuplicates = true;
				}
				System.out.print(array[i] + " ");
			}
		}
		
		if (!foundDuplicates) {
			System.out.println("No duplicates found.");
		} else {
			System.out.println();
		}
	}
	
}

public class DuplicatesFinderArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 5, 6, 7, 1 };

		findDuplicates.DuplicatesFinder(array);
	}

}
	





