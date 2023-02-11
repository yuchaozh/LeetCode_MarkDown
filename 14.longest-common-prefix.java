/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (40.24%)
 * Likes:    12556
 * Dislikes: 3731
 * Total Accepted:    2.2M
 * Total Submissions: 5.3M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        // get the shortest string length;
        int shortestLength = Integer.MAX_VALUE;
        for (String s : strs) {
            if (shortestLength > s.length()) {
                shortestLength = s.length();
            }
        }

        // loop all strings
        for (int i = 0; i < shortestLength; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return sb.toString();
                }
                if (j == strs.length - 1) {
                    sb.append(currentChar);
                }
            }
        }

        return sb.toString();
    }
}
// @lc code=end

