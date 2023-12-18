import java.util.Stack;

class ReverseString {
    public static String reverseString(String s) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character from the input string onto the stack
        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Pop characters from the stack and append them to the StringBuilder
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Convert the StringBuilder to a string and return the reversed string
        return reversed.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(reverseString("Hello, World!")); // Output: "!dlroW ,olleH"
        System.out.println(reverseString("OpenAI")); // Output: "IANepO"
        System.out.println(reverseString("Stacks are fun!")); // Output: "!nuf era skcatS"
    }
}
