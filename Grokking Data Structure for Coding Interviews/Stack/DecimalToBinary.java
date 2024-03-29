import java.util.Stack;

class DecimalToBinary {
    public static String decimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test cases to convert decimal numbers to binary
        System.out.println(decimalToBinary(2));   // Output: 10
        System.out.println(decimalToBinary(7));   // Output: 111
        System.out.println(decimalToBinary(18));  // Output: 10010
    }
}
