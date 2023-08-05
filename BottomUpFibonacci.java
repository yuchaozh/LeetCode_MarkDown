class BottomUpFibonacci {
    public static int fibonacci(int n) {
        if (n == 0) return 0; // Edge case

        // Create a table to store Fibonacci numbers
        int[] fibTable = new int[n + 1];

        // Base case
        fibTable[0] = 0;
        fibTable[1] = 1;

        // Fill fibTable in bottom-up manner
        for (int i = 2; i <= n; i++) {
            fibTable[i] = fibTable[i - 1] + fibTable[i - 2];
        }

        // Return nth Fibonacci number
        return fibTable[n];
    }
    
    public static void main(String [] args) {
        int n = 13;

        // Display nth Fibonacci number
        System.out.println("Fibonacci number of " + n + " is " + fibonacci(n));
    }
}
