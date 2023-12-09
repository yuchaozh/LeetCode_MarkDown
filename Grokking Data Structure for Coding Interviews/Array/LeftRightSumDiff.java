class LeftRightSumDiff {

    public int[] findDifferenceArray(int[] nums) {
        int length = nums.length;
        int[] leftSum = new int[length];
        int[] rightSum = new int[length];
        int[] differenceArray = new int[length];

        // calculate the left sum array
        leftSum[0] = nums[0];
        for (int i = 1; i < length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
        }
        // calculate the right sum array
        rightSum[length - 1] = nums[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i];
        }

        // calculate the difference array
        for (int i = 0; i < length; i++) {
            differenceArray[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return differenceArray;
    }

    public static void main(String[] args) {
        LeftRightSumDiff solution = new LeftRightSumDiff();
        int[] example1 = { 2, 5, 1, 6 };
        int[] example2 = { 3, 1, 4, 2, 2 };
        int[] example3 = { 1, 2, 3, 4, 5 };

        // Output should be: [12, 5, 1, 8]
        printArray(solution.findDifferenceArray(example1));
        // Output should be: [9, 5, 0, 6, 10]
        printArray(solution.findDifferenceArray(example2));
        // Output should be: [14, 11, 6, 1, 10]
        printArray(solution.findDifferenceArray(example3));
    }

    // Helper method to print array elements
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
