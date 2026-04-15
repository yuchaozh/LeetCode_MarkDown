import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public boolean checkContainsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(); // Use HashSet to store unique elements
    for (int x : nums) {
      if (!set.add(x)) // If the set already contains the current element, return true
        return true;
    }
    return false; // Return false if no duplicates found
  }

  // two loops
  public boolean containsDuplicateV2(int[] nums) {
    if (nums == null || nums.length < 2) {
      return false;
    }

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }

    return false;
  }

  // sort and one loop check
  public boolean containsDuplicateV3(int[] nums) {
    if (nums == null || nums.length < 2) {
      return false;
    }

    Arrays.sort(nums);

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        return true;
      }
    }

    return false;
  }

  // check the first element with the next element so that we dont need to check
  // nums == null || nums.length < 2
  public boolean containsDuplicateV4(int[] nums) {
    Arrays.sort(nums); // sort the array
    // use a loop to compare each element with its next element
    for (int i = 0; i < nums.length - 1; i++) {
      // if any two elements are the same, return true
      if (nums[i] == nums[i + 1]) {
        return true;
      }
    }
    return false; // if no duplicates are found, return false
  }

  public static void main(String[] args) {
    ContainsDuplicate solution = new ContainsDuplicate();

    int[] nums1 = {1, 2, 3, 4};
    System.out.println(solution.checkContainsDuplicate(nums1)); // Expected output: false

    int[] nums2 = {1, 2, 3, 1};
    System.out.println(solution.checkContainsDuplicate(nums2)); // Expected output: true

    int[] nums3 = {};
    System.out.println(solution.checkContainsDuplicate(nums3)); // Expected output: false

    int[] nums4 = {1, 1, 1, 1};
    System.out.println(solution.checkContainsDuplicate(nums4)); // Expected output: true
  }
}
