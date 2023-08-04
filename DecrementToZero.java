class DecrementToZero {
    public static void decrement(int n) {
        System.out.println(n);
        if (n > 0) {
            decrement(n-1); // recursive call
            // decrement(n--); does not work, is wrong
        }
    }
    
    public static void main (String[] args) {
        decrement(5);
    }
}
