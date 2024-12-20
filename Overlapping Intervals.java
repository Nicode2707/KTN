class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
         int n = arr.length; // size of the array
        
        // Sort the intervals by their start times
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // Result list to store merged intervals
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If the result list is empty or the current interval does not overlap with the last interval
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[]{arr[i][0], arr[i][1]});
            } 
            // If the current interval overlaps with the last interval in the result list
            else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], arr[i][1]);
            }
        }
        return ans;
    }
}
