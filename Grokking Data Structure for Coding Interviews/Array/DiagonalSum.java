class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += mat[i][i] + mat[i][n - i - 1];
        }

        if (n % 2 != 0) {
            total -= mat[n / 2][n / 2];
        }

        return total;
    }
    
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));  // Output: 25
        System.out.println(diagonalSum(new int[][]{{1,0},{0,1}}));  // Output: 2
        System.out.println(diagonalSum(new int[][]{{5}}));  // Output: 5
    }
}
