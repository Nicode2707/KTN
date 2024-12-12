class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        
         if (s1.length() != s2.length()) {
            return false;
        }
      
      
      // Convert the strings into character arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
         
         
         // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


      // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    }
