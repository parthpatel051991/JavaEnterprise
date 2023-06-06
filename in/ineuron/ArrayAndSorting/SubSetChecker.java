package in.ineuron.ArrayAndSorting;

import java.util.HashSet;
import java.util.Set;

public class SubSetChecker {
   
    public static boolean checkSubset(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();

        // Add all elements from array1 to a set
        for (int num : array1) {
            set.add(num);
        }

        // Check if all elements in array2 are present in the set
        for (int num : array2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }
    
    //main method for testing
    
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 5};

        boolean isSubset = checkSubset(array1, array2);

        if (isSubset) {
            System.out.println("Array2 is a subset of Array1");
        } else {
            System.out.println("Array2 is not a subset of Array1");
        }
    }
    
    
    
    
    
}

