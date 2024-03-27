public class ReverseVowelsofaString {
    static class Solution {
        public String reverseVowels(String s) {
            var l = s.toCharArray();
            int left = 0, right = s.length() - 1;
            while (left < right)
            {
                while (left<right && (l[left]!='a' && l[left]!='e' && l[left]!='i' && l[left]!='o' && l[left]!='u' && l[left]!='A' && l[left]!='E' && l[left]!='I' && l[left]!='O' && l[left]!='U')){
                    left++;
                }
                while (left<right && (l[right]!='a' && l[right]!='e' && l[right]!='i' && l[right]!='o' && l[right]!='u' && l[right]!='A' && l[right]!='E' && l[right]!='I' && l[right]!='O' && l[right]!='U')){
                    right--;
                }
                if (left<right){
                    char x = l[left];
                    l[left] = l[right];
                    l[right] = x;
                    left++;
                    right--;
                }
            }
            return new String(l);
        }
    }
}
