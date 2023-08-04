class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Factorial (recursive) of " + n + " is " + factorial(n));
        System.out.println("Factorial (iterative) of " + n + " is " + factorialIterative(n));
    }
}
