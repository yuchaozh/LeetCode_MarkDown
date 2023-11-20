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
