package in.ineuron.ArrayAndSorting;

public class BubbleSort {
   
    public static void bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    
    
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        
        System.out.println("Original Array: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nSorted Array: ");
        printArray(array);
    }
    
	/*
	 * output ::
	 * 
	 * Original Array: 7 2 1 6 8 5 3 4
	 * 
	 * Sorted Array: 1 2 3 4 5 6 7 8
	 */
	 
    
}
