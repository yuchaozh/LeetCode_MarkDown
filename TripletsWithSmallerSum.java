import java.util.Arrays;

class TripletsWithSmallerSum {
    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        if (arr == null || arr.length < 3) {
          return count;
        }
    
        Arrays.sort(arr);
    
        for (int i = 0; i < arr.length - 2; i++) {
          int left = i + 1, right = arr.length - 1;
          while (left < right) {
            int sum = arr[i] + arr[left] + arr[right];
            if (sum >= target) {  // we need a pair with a smaller sum
              right--;  
            } else {  // found the triplet
              // since arr[right] >= arr[left], therefore, we can replace arr[right] by any number between
              // left and right to get a sum less than the target sum
              count += right - left;  
              left++;
            }
          }
        }
        
        return count;
      }
    
    public static void main(String[] args) {
        System.out.println(
            TripletsWithSmallerSum.searchTriplets(new int[] { -1, 0, 2, 3 }, 3));
        System.out.println(
            TripletsWithSmallerSum.searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
      }
}
