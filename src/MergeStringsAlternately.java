public class MergeStringsAlternately {
    static class Solution {
        public String mergeAlternately(String word1, String word2) {
            var l1 = word1.toCharArray();
            var l2 = word2.toCharArray();
            int l = l1.length + l2.length;
            var s = new char[l];
            int i = 0, j = 0, k = 0;

            while (i < l1.length && j < l2.length) {
                s[k++] = l1[i++];
                s[k++] = l2[j++];
            }

            while (i < l1.length) {
                s[k++] = l1[i++];
            }

            while (j < l2.length) {
                s[k++] = l2[j++];
            }
            return new String(s);
        }
    }

}
