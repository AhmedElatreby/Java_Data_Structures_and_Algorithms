package BigO;

public class CalculateSum {
// Create a function which calculate the sum and product of elements of array
     public void somOfArray(int[] array ){
        int sum = 0; // O(1)
        int product = 1;  // O(1)
        for (int i = 0; i < array.length; i++) { // O(n)
            sum += array[i]; // O(1)
        }
         for (int i = 0; i < array.length; i++) { // O(n)
             product *= array[i]; // O(1)
         }
         System.out.println("Sum of the array: " + sum + ", " + "The product of the array: " + product); // O(1)

         // The Time Complexity: O(n)

    }
}
