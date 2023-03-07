import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (59.64%)
 * Likes:    3270
 * Dislikes: 905
 * Total Accepted:    1.2M
 * Total Submissions: 2M
 * Testcase Example:  '[1,2,3,1]'
 *
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 */

// @lc code=start
// HashSet
// Time complexity: O(n). We do search() and insert() for nn times and each operation takes constant time.
// Space complexity: O(n). The space used by a hash table is linear with the number of elements in it.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        
        return false;
    }
}

// a more neat version
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}

// Set add(), https://www.geeksforgeeks.org/set-add-method-in-java-with-examples/
// The function returns True if the element is not present in the set and is new, 
// else it returns False if the element is already present in the set
public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(); // Use HashSet to store unique elements
    for (int x : nums) {
      if (!set.add(x)) // If the set already contains the current element, return true
        return true;
    }
    return false; // Return false if no duplicates found
}

// sorting
// Time Complexity O(n * logN), because sorting array take that much time.
// Space Complexity O(1) or O(n). depending on the sorting algorithm used.
public boolean containsDuplicate(int[] nums) {
    if (nums == null || nums.length < 2) {
        return false;
    }

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == nums[i + 1]) {
            return true;
        }
    }

    return false;
}
// @lc code=end

