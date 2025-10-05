// Pair 3: Linear Array Algorithms
// Student B - Kadane’s Algorithm (Maximum Subarray Sum with Position Tracking)

public class KadaneAlgorithm {

    // Method to find maximum subarray sum with start and end index tracking
    public static void findMaxSubarray(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > currentSum + array[i]) {
                currentSum = array[i];
                tempStart = i;
            } else {
                currentSum += array[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

         // Output result
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Start Index: " + start);
        System.out.println("End Index: " + end);
        System.out.print("Subarray: [ ");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print("Input Array: [ ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        findMaxSubarray(numbers);
    }
}
