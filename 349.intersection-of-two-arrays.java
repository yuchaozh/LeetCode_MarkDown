/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 *
 * algorithms
 * Easy (69.76%)
 * Likes:    5157
 * Dislikes: 2174
 * Total Accepted:    906.8K
 * Total Submissions: 1.3M
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must be unique and you may return
 * the result in any order.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 * 
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }

        int[] results = new int[intersect.size()];
        int index = 0;
        for (Integer num : intersect) {
            results[index++] = num;
        }

        return results;
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                set.remove(nums2[i]);
                arrayList.add(nums2[i]);
            }
        }

        int[] results = new int[arrayList.size()];
        int index = 0;
        for (Integer num : arrayList) {
            results[index++] = num;
        }

        return results;
    }
}
// @lc code=end

