class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        // Array to store the frequency of each character
        int[] freq = new int[26]; // Assuming only lowercase Latin letters

        // First pass: count the frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Second pass: find the first character with a frequency of 1
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }

        // If no non-repeating character is found
        return '$';
    }
}
