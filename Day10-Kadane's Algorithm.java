// User function Template for Java
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
          // Initialize maxsum to the smallest possible integer
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentsum += arr[i];
            maxsum = Math.max(maxsum, currentsum);

            // Reset currentsum to 0 if it drops below 0
            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        return maxsum;
    }
}
