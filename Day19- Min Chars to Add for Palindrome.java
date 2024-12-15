class Solution {
    public static int minChar(String s) {
        // Write your code here
    // Reverse the string
        String rev = new StringBuilder(s).reverse().toString();
        // Combine original and reversed string with a separator
        String combine = s + "*" + rev;
        int n = combine.length();

        // Create the LPS (Longest Prefix Suffix) array
        int[] lps = new int[n];
        for (int i = 1, len = 0; i < n; ) {
            if (combine.charAt(i) == combine.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        // Calculate the minimum characters to add
        return s.length() - lps[n - 1];
    }
}
