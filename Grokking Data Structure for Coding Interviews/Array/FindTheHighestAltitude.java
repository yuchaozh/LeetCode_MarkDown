class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0; // To store the current altitude during iteration
        int maxAltitude = 0; // To store the maximum altitude encountered

        // Iterate through the gain array, updating the current and max altitudes
        for(int i : gain) {
            currentAltitude += i;
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }

        return maxAltitude;
    }

    /** my solution 
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0; 
        
        if (gain == null || gain.length < 1) {
            return 0;
        }

        maxAltitude = gain[0];
        for (int i = 1; i < gain.length; i++) {
            gain[i] += gain[i - 1];
            maxAltitude = Math.max(gain[i], maxAltitude);
        }
        
        return maxAltitude;
    }
     */
    

    public static void main(String[] args) {
        FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();
        
        // Example 1
        System.out.println(findTheHighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7})); // Expected: 1
        
        // Example 2
        System.out.println(findTheHighestAltitude.largestAltitude(new int[]{4, -3, 2, -1, -2})); // Expected: 4
        
        // Example 3
        System.out.println(findTheHighestAltitude.largestAltitude(new int[]{2, 2, -3, -1, 2, 1, -5})); // Expected: 4
    }
}
