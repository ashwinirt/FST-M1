/*
 * In this activity, we will be implementing the Insertion Sort algorithm
 * Add a class named Activity4.
    In the main() method:
        Initialize an array with numbers in random order
        Use the insertion sort logic to sort the array in ascending order.
        Display the array before and after sorting.


 */

package activities;

class Activity4 {
	
	// Method to perform Insertion Sort
    public static void insertionSort(int[] array) {
        // Loop through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            int key = array[i];  // The current element to be inserted
            int j = i - 1;

            // Shift elements that are greater than the key to the right
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];  // Shift element to the right
                //j = j - 1;
                --j;
            }
            // Insert the key at its correct position
            array[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example array to sort
        int[] array = { 9, 5, 1, 4, 3 };

        System.out.println("Original array:");
        printArray(array);  // Print original array

        // Perform Insertion Sort
        insertionSort(array);

        System.out.println("Sorted array:");
        printArray(array);  // Print sorted array
    }

}
