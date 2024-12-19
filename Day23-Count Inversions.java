// User function Template for Java

class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Call mergeSort to count inversions
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            cnt += mergeSort(arr, low, mid);      // Sort and count left half
            cnt += mergeSort(arr, mid + 1, high); // Sort and count right half
            cnt += merge(arr, low, mid, high);    // Merge and count inversions
        }
        return cnt;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1]; // Temporary array
        int left = low;      // Starting index of the left half
        int right = mid + 1; // Starting index of the right half
        int index = 0;       // Index for the temporary array

        int cnt = 0; // To count inversions

        // Merge two sorted halves while counting inversions
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
                cnt += (mid - left + 1); // Count inversions
            }
        }

        // Add remaining elements from the left half
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Add remaining elements from the right half
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // Copy sorted elements back to the original array
        for (int i = low, j = 0; i <= high; i++, j++) {
            arr[i] = temp[j];
        }

        return cnt;
    }
}
