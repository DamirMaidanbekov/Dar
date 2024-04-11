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

//https://leetcode.com/problems/single-number/description/
        SingleNumber.Solution SingleNumber = new SingleNumber.Solution();
        System.out.println(SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));

//https://leetcode.com/problems/majority-element/description/
        MajorityElement.Solution MajorityElement = new MajorityElement.Solution();
        System.out.println(MajorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));

//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
        EvaluateReversePolishNotation.Solution EvaluateReversePolishNotation = new EvaluateReversePolishNotation.Solution();
        System.out.println(EvaluateReversePolishNotation.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));

//https://leetcode.com/problems/decode-string/?envType=study-plan-v2&envId=leetcode-75
        DecodeString.Solution DecodeString = new DecodeString.Solution();
        System.out.println(DecodeString.decodeString("3[a]2[bc]"));
    }
}

