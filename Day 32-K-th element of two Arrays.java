// Java Program to find K-th Element of Merged Two Sorted Arrays
// Using merge step of merge sort

class GfG {
    static int kthElement(int[] a, int[] b, int k) {
        int n = a.length, m = b.length;

        // array to store the merged sorted array
        int[] arr = new int[n + m];
        int i = 0, j = 0, d = 0;

        while (i < n && j < m) {
            
            // If the element of a[] is smaller, insert the
            // element to the sorted array
            if (a[i] < b[j]) {
                arr[d++] = a[i++];
            }
            
            // If the element of b[] is smaller, insert the
            // element to the sorted array
            else {
                arr[d++] = b[j++];
            }
        }

        // Push the remaining elements of a[]
        while (i < n) {
            arr[d++] = a[i++];
        }

        // Push the remaining elements of b[]
        while (j < m) {
            arr[d++] = b[j++];
        }

        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;

        System.out.println(kthElement(a, b, k));
    }
}
