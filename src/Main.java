import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//https://leetcode.com/problems/remove-element/description/
        RemoveElement.Solution RemoveElement = new RemoveElement.Solution();
        System.out.println(RemoveElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));

//https://leetcode.com/problems/palindrome-number/description/
        PalindromeNumber.Solution PalindromeNumber = new PalindromeNumber.Solution();
        System.out.println(PalindromeNumber.isPalindrome((121)));

//https://leetcode.com/problems/plus-one/description/
        PlusOne.Solution PlusOne = new PlusOne.Solution();
        System.out.println(Arrays.toString(PlusOne.plusOne(new int[]{1, 2, 3})));

//https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
        MaximumAverageSubarrayI.Solution MaximumAverageSubarrayI = new MaximumAverageSubarrayI.Solution();
        System.out.println(MaximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));

//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
        ReverseVowelsofaString.Solution ReverseVowelsofaString = new ReverseVowelsofaString.Solution();
        System.out.println(ReverseVowelsofaString.reverseVowels("Hello"));

//https:leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
        MergeStringsAlternately.Solution MergeStringsAlternately = new MergeStringsAlternately.Solution();
        System.out.println(MergeStringsAlternately.mergeAlternately("abc", "pqr"));
    }
}

