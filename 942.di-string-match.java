/*
 * @lc app=leetcode id=942 lang=java
 *
 * [942] DI String Match
 *
 * https://leetcode.com/problems/di-string-match/description/
 *
 * algorithms
 * Easy (76.26%)
 * Likes:    2071
 * Dislikes: 830
 * Total Accepted:    125.4K
 * Total Submissions: 162.8K
 * Testcase Example:  '"IDID"'
 *
 * A permutation perm of n + 1 integers of all the integers in the range [0, n]
 * can be represented as a string s of length n where:
 * 
 * 
 * s[i] == 'I' if perm[i] < perm[i + 1], and
 * s[i] == 'D' if perm[i] > perm[i + 1].
 * 
 * 
 * Given a string s, reconstruct the permutation perm and return it. If there
 * are multiple valid permutations perm, return any of them.
 * 
 * 
 * Example 1:
 * Input: s = "IDID"
 * Output: [0,4,1,3,2]
 * Example 2:
 * Input: s = "III"
 * Output: [0,1,2,3]
 * Example 3:
 * Input: s = "DDI"
 * Output: [3,2,0,1]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 10^5
 * s[i] is either 'I' or 'D'.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] diStringMatch(String s) {
        int length = s.length();
        int low = 0, high = length;
        int[] results = new int[length + 1];

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'I') {
                results[i] = low++;
            } else {
                results[i] = high--;
            }
        }
        results[length] = low;
        
        return results;
    }
}
// @lc code=end

