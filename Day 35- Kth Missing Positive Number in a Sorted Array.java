class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length, l=0, r=n-1, ans=n+k;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]-(mid+1)<k)  l=mid+1;
            else{
                ans=mid+k;
                r=mid-1;
            }
        }
        return ans;
    }
}
