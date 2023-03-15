import java.util.*;

class NumGoodPairs {
    public static int numGoodPairs(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        int pairCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            pairCount += map.get(num) - 1;
        }

        return pairCount;
    }
    
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1, 1, 3 };
        int result1 = numGoodPairs(nums1);
        System.out.println("Result 1: " + result1 + " (Expected: 4)");
    
        int[] nums2 = { 1, 1, 1, 1 };
        int result2 = numGoodPairs(nums2);
        System.out.println("Result 2: " + result2 + " (Expected: 6)");
    
        int[] nums3 = { 1, 2, 3 };
        int result3 = numGoodPairs(nums3);
        System.out.println("Result 3: " + result3 + " (Expected: 0)");
    }
}
