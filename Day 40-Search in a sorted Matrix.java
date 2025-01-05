class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
         int n = mat.length;
        if (n == 0) return false;
        int m = mat[0].length;

        // Start from top-right corner
        int i = 0, j = m - 1;

        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                return true; // Element found
            } else if (mat[i][j] > x) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }

        return false; // Element not found
    }
}
