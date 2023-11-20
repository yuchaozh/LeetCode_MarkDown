class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        // Check if the array is null or has no elements and return an empty array if true
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        // Initialize an array to store the running sum
        int[] result = new int[nums.length];
        result[0] = nums[0];
        
        // Loop through the array starting from index 1, adding the previous sum to the current element
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        
        // Return the array containing the running sum
        return result;
    }

    public int[] runningSumV2(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            result[i] = sum + nums[i];
            sum = result[i];
        }
        return result;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray solution = new RunningSumOf1dArray();
        
        // Test cases
        int[][] testInputs = {
            {1,2,3,4},
            {3,1,4,2,2},
            {-1,-2,-3,-4,-5}
        };

        for (int[] input : testInputs) {
            int[] output = solution.runningSum(input);
            
            // Print the output array
            for (int val : output) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
