public class PlusOne {
    static class Solution {
        public int[] plusOne(int[] digits) {
            int l = digits.length;
            digits[l-1] += 1;
            for (int i = l - 1; i >=0; i--){
                if (digits[i] == 10) {
                    digits[i] = 0;
                    if (i == 0){
                        int[] x = new int[l+1];
                        x[0] = 1;
                        return x;
                    }
                    digits[i - 1] += 1;
                } else {
                    break;
                }
            }
            return digits;
        }
    }
}
