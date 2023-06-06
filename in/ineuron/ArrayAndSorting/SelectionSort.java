package in.ineuron.ArrayAndSorting;

public class SelectionSort {
  

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            swap(array, i, minIndex);
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
    
    //main method
    
    public static void main(String[] args) {
        int[] array = {5,1,2,2,3,4};
        
        System.out.println("Original Array: ");
        printArray(array);

        selectionSort(array);

        System.out.println("\nSorted Array: ");
        printArray(array);
    }
       
    
}

