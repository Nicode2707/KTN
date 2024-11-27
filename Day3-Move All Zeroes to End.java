class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int [] temp = new int[n];
        
        int j = 0;
        
         for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp[j++] = arr[i];
        }

        while(j < n ){
         temp[j++] = 0;
       }
     
       for (int i = 0; i < n; i++)
            arr[i] = temp[i];
       }
        
    }
