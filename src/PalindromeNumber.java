public class PalindromeNumber {
    static class Solution {
        public boolean isPalindrome(int x) {
            boolean trigger = true;
            String xx = Integer.toString(x);
            int[] xxx = new int[xx.length()];
            for (int i = 0; i < xx.length(); i++)
            {
                xxx[i] = xx.charAt(i) - '0';
            }
            for (int i = 0; i < xx.length()/2; i++) {
                if (xxx[i] != xxx[xx.length() - 1 - i]) {
                    trigger = false;
                    break;
                }
            }
            return trigger;
        }
    }
}
