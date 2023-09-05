import java.util.ArrayList;
import java.util.List;

class SubarraysWithProductLessThanATarget {
    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        // Resultant list to store all valid subarrays
        List<List<Integer>> result = new ArrayList<>();

        // Variable to store the product of elements in the current subarray
        double product = 1;

        // left boundary of the current subarray
        int left = 0;

        // Iterate over the array using 'right' as the right boundary of the current subarray
        for (int right = 0; right < arr.length; right++) {
            // Update the product with the current element
            product *= arr[right];

            // If the product is greater than or equal to the target, slide the left
            // boundary to the right until product is less than target
            while (product >= target && left < arr.length) {
                product /= arr[left++];
            }

            // Create a temporary list to store the current subarray
            List<Integer> tempList = new ArrayList<>();

            // Iterate from 'right' to 'left' and add all these subarrays to the result.
            for (int i = right; i >= left; i--) {
                // Add the current element at the beginning of the list
                tempList.add(0, arr[i]);

                // Add the current subarray to the result
                result.add(new ArrayList<>(tempList));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[] { 2, 5, 3, 10 }, 30));
    System.out.println(findSubarrays(new int[] { 8, 2, 6, 5 }, 50));
    }
}