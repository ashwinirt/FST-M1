/*
In this activity, we are writing a program to check if the sum of all the 10's in the array is exactly 30.

The program returns false if the condition does not satisfy, otherwise returns true.

Instructions:

    Add a Class named Activity2.
    In the main() method:
        Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
        Find the 10's in the array and add them
        Check if value is equal to 30.


*/
package activities;
import java.util.*;
public class Activity2 {

	 public static void main(String[] args) {
	        // Step 1: Initialize the array
	        int[] numbers = {10, 77, 10, 54, -11, 10};
	        System.out.println("Original Array: " + Arrays.toString(numbers));

	        // Step 2: Variable to store the sum of 10's
	        int sumOfTens = 0;

	        // Step 3: Iterate through the array and add the 10's to the sum
	        for (int num : numbers) {
	            if (num == 10) {
	                sumOfTens += num;
	            }
	            if(sumOfTens>30)break;
	        }

	        // Step 4: Check if the sum is exactly 30
	        if (sumOfTens == 30) {
	            System.out.println("True");
	        } else {
	            System.out.println("False");
	        }
	    }

}
