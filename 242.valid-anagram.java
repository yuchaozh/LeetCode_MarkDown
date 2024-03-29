/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 *
 * https://leetcode.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (60.60%)
 * Likes:    3839
 * Dislikes: 196
 * Total Accepted:    1.1M
 * Total Submissions: 1.7M
 * Testcase Example:  '"anagram"\n"nagaram"'
 *
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length, t.length <= 5 * 10^4
 * s and t consist of lowercase English letters.
 * 
 * 
 * 
 * Follow up: What if the inputs contain Unicode characters? How would you
 * adapt your solution to such a case?
 * 
 */

// @lc code=start
class Solution {
    public static boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            map[c - 'a']--;
        }
        for (int num : map) {
            if (num != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // Test case 1
        String s1 = "listen";
        String t1 = "silent";
        System.out.println(isAnagram(s1, t1)); // Expected output: true
    
        // Test case 2
        String s2 = "hello";
        String t2 = "world";
        System.out.println(isAnagram(s2, t2)); // Expected output: false
    
        // Test case 3
        String s3 = "anagram";
        String t3 = "nagaram";
        System.out.println(isAnagram(s3, t3)); // Expected output: true
    
        // Test case 4
        String s4 = "rat";
        String t4 = "car";
        System.out.println(isAnagram(s4, t4)); // Expected output: false
    
        // Test case 5
        String s5 = "";
        String t5 = "";
        System.out.println(isAnagram(s5, t5)); // Expected output: true
    }
}
// @lc code=end

