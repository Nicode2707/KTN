class Solution {
    public String addBinary(String s1, String s2) {
        // code here
            StringBuilder ans = new StringBuilder();
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;

        // Process the binary strings from the end
        while (i >= 0 || j >= 0) {
            int count1s = 0;

            if (i >= 0 && s1.charAt(i) == '1') count1s++;
            if (j >= 0 && s2.charAt(j) == '1') count1s++;

            // Determine the bit and the carry
            if (count1s + carry == 0) {
                ans.append('0');
                carry = 0;
            } else if (count1s + carry == 1) {
                ans.append('1');
                carry = 0;
            } else if (count1s + carry == 2) {
                ans.append('0');
                carry = 1;
            } else if (count1s + carry == 3) {
                ans.append('1');
                carry = 1;
            }

            // Move to the next bits
            i--;
            j--;
        }

        // Add carry if remaining
        if (carry == 1) {
            ans.append('1');
        }

        // Reverse the result since it was constructed from LSB to MSB
        ans.reverse();

        // Remove leading zeros if any
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.toString();
    }
}
