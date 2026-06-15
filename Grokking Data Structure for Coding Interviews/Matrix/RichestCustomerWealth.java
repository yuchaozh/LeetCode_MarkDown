public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;  // Initialize maxWealth to 0
        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        // Example test cases
        System.out.println(RichestCustomerWealth.maximumWealth(new int[][]{{5,2,3},{0,6,7}}));  // 13
        System.out.println(RichestCustomerWealth.maximumWealth(new int[][]{{1,2},{3,4},{5,6}}));  // 11
        System.out.println(RichestCustomerWealth.maximumWealth(new int[][]{{5,10,15},{10,20,30},{15,30,45}}));  // 90
    }
}
