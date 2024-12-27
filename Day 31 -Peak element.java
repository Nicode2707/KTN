class Solution {

    public int peakElement(int[] arr) {
        // code here
        // Handle edge cases
        if (arr.length == 1) {
            return 0; // If there's only one element, it's the peak
        }

        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is a peak
            if ((i == 0 || arr[i] >= arr[i - 1]) && 
                (i == arr.length - 1 || arr[i] >= arr[i + 1])) {
                return i;
            }
        }

        return -1; // This shouldn't be reached for a valid input
    }
}
