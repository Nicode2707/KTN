
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
    int size = arr.length; // Initialize size to the length of the array
        int i = 0;
        
        while (i < size) {
            // Check if the current element is in the range and not in its correct position
            if (arr[i] > 0 && arr[i] <= size && arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }
        
        // Find the first missing positive number
        for (i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all numbers from 1 to size are present
        return size + 1;
    }
}
