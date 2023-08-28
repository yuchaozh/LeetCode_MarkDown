/*
 * @lc app=leetcode id=1332 lang=java
 *
 * [1332] Remove Palindromic Subsequences
 *
 * https://leetcode.com/problems/remove-palindromic-subsequences/description/
 *
 * algorithms
 * Easy (75.96%)
 * Likes:    1504
 * Dislikes: 1638
 * Total Accepted:    119.8K
 * Total Submissions: 157.2K
 * Testcase Example:  '"ababa"'
 *
 * You are given a string s consisting only of letters 'a' and 'b'. In a single
 * step you can remove one palindromic subsequence from s.
 * 
 * Return the minimum number of steps to make the given string empty.
 * 
 * A string is a subsequence of a given string if it is generated by deleting
 * some characters of a given string without changing its order. Note that a
 * subsequence does not necessarily need to be contiguous.
 * 
 * A string is called palindrome if is one that reads the same backward as well
 * as forward.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "ababa"
 * Output: 1
 * Explanation: s is already a palindrome, so its entirety can be removed in a
 * single step.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "abb"
 * Output: 2
 * Explanation: "abb" -> "bb" -> "". 
 * Remove palindromic subsequence "a" then "bb".
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "baabb"
 * Output: 2
 * Explanation: "baabb" -> "b" -> "". 
 * Remove palindromic subsequence "baab" then "b".
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 1000
 * s[i] is either 'a' or 'b'.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int removePalindromeSub(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        if (isPalindrome(s)) {
            return 1;
        }

        return 2;
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

class Solution {
    public int removePalindromeSub(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversedString = sb.toString();
        if (reversedString.equals(s)) {
            return 1;
        }

        return 2;
    }
}
// @lc code=end
