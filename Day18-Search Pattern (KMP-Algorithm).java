class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> result = new ArrayList<>();
        int[] lps = computeLPS(pat);
        
        int i = 0;  // txt index
        int j = 0;  // pattern index
        
        while (i < txt.length()) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            
            if (j == pat.length()) {
                result.add(i - j);
                j = lps[j - 1];
            }
            
            // Mismatch after j matches
            else if (i < txt.length() && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        
        return result;
    }
    
    // Compute Longest Prefix Suffix array
    private int[] computeLPS(String pat) {
        int[] lps = new int[pat.length()];
          int len = 0;
        int i = 1;
        
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps;
        
    }
}
