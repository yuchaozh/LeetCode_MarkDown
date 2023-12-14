class FindMaxOnesRow {
    public static int[] findMaxOnesRow(int[][] mat) {
        int maxOnesIdx = 0;
        int maxOnesCount = 0;
        int row = mat.length;
        int column = mat[0].length;

        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < column; j++) {
                rowSum += mat[i][j];
            }
            if (rowSum > maxOnesCount) {
                maxOnesCount = rowSum;
                maxOnesIdx = i;
            }
        }
        return new int[]{maxOnesIdx, maxOnesCount};
    }
    
    public static void main(String[] args) {
        // Applying example inputs
        int[] result1 = findMaxOnesRow(new int[][]{{1, 0}, {1, 1}, {0, 1}});
        System.out.println(result1[0] + ", " + result1[1]);  // Output: 1, 2
        
        int[] result2 = findMaxOnesRow(new int[][]{{0, 1, 1}, {0, 1, 1}, {1, 1, 1}});
        System.out.println(result2[0] + ", " + result2[1]);  // Output: 2, 3
        
        int[] result3 = findMaxOnesRow(new int[][]{{1, 0, 1}, {0, 0, 1}, {1, 1, 0}});
        System.out.println(result3[0] + ", " + result3[1]);  // Output: 0, 2
    }
}
