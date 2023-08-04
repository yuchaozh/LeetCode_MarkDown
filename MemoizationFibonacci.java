import java.util.HashMap;

class MemoizationFibonacci {
    // create a map for memoization
    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static int fibonacci(int n) {
        // If value is in cache, return it
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;

        // Set base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Computer the Fibonacci number recursively
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }

        // Store the result in cache before returning
        cache.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println("Fibonacci number of " + n + " is " + fibonacci(n));
    }
}
