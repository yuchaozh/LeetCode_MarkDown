class DutchNationalFlagProblem {
    public static void sort(int[] nums) {
        int low = 0, high = nums.length - 1;
        for (int i = 0; i <= high;) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                swap(nums, i, low);
                i++;
                low++;
            } else {
                swap(nums, i, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 1, 0 };
        DutchNationalFlagProblem.sort(arr);
        for (int num : arr)
          System.out.print(num + " ");
        System.out.println();
    
        arr = new int[] { 2, 2, 0, 1, 2, 0 };
        DutchNationalFlagProblem.sort(arr);
        for (int num : arr)
          System.out.print(num + " ");
    }
}
