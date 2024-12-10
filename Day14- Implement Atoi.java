//{ Driver Code Starts
// Initial template for JAVA

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();

            Solution obj = new Solution();
            int num = obj.myAtoi(str);
            System.out.println(num);
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public int myAtoi(String s) {
        // Your code here
         int i = 0, sign = 1;
        long ans = 0;

        // Step 1: Ignore leading whitespaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle optional sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert numeric characters to integer
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            ans = ans * 10 + (s.charAt(i) - '0');

            // Step 4: Handle overflow/underflow
            if (sign * ans >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign * ans <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        // Step 5: Return the final result
        return (int) (sign * ans);
    }
}
