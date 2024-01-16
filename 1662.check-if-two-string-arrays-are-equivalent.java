/*
 * @lc app=leetcode id=1662 lang=java
 *
 * [1662] Check If Two String Arrays are Equivalent
 *
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
 *
 * algorithms
 * Easy (83.83%)
 * Likes:    2866
 * Dislikes: 198
 * Total Accepted:    435.1K
 * Total Submissions: 510.9K
 * Testcase Example:  '["ab", "c"]\n["a", "bc"]'
 *
 * Given two string arrays word1 and word2, return true if the two arrays
 * represent the same string, and false otherwise.
 * 
 * A string is represented by an array if the array elements concatenated in
 * order forms the string.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Output: true
 * Explanation:
 * word1 represents string "ab" + "c" -> "abc"
 * word2 represents string "a" + "bc" -> "abc"
 * The strings are the same, so return true.
 * 
 * Example 2:
 * 
 * 
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 * Output: false
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 * Output: true
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= word1.length, word2.length <= 10^3
 * 1 <= word1[i].length, word2[i].length <= 10^3
 * 1 <= sum(word1[i].length), sum(word2[i].length) <= 10^3
 * word1[i] and word2[i] consist of lowercase letters.
 * 
 * 
 */

// @lc code=start
class Solution {
    // public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    //     StringBuilder sb1 = new StringBuilder();
    //     for (String s : word1) {
    //         sb1.append(s);
    //     }

    //     StringBuilder sb2 = new StringBuilder();
    //     for (String s : word2) {
    //         sb2.append(s);
    //     }

    //     return sb1.compareTo(sb2) == 0;
    // }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Pointers to mark the current word in the given two lists
        int word1Pointer = 0, word2Pointer = 0;
        // Pointers to mark the char in the string pointed by the above pointers.
        int string1Pointer = 0, string2Pointer = 0;

        while (word1Pointer < word1.length && word2Pointer < word2.length) {
            if (word1[word1Pointer].charAt(string1Pointer) != word2[word2Pointer].charAt(string2Pointer)) {
                return false;
            }

            string1Pointer++;
            string2Pointer++;
            
            if (string1Pointer == word1[word1Pointer].length()) {
                string1Pointer = 0;
                word1Pointer++;
            }

            if (string2Pointer == word2[word2Pointer].length()) {
                string2Pointer = 0;
                word2Pointer++;
            }
        }

        return word1Pointer == word1.length && word2Pointer == word2.length;
    }
}
// @lc code=end

