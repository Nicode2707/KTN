class Solution {
    public boolean check(int[] stalls, int k, int mid) {
        int count = 0;
        int prev = -1;
        for (int i = 0; i < stalls.length; i++) {
            if (prev == -1 || stalls[i] - prev >= mid) {
                count++;
                prev = stalls[i];
            }
        }
        return count >= k;
    }

    // Main function to calculate the largest minimum distance
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls); // Sort the stall positions
        int n = stalls.length;
        int lo = 0, hi = stalls[n - 1] - stalls[0];
        int ans = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (check(stalls, k, mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
