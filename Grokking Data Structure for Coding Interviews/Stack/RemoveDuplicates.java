import java.util.Stack;

class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        Stack<Character> stack = new Stack<>();

        for (char s : str.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(s);
            } else if (stack.peek() == s) {
                stack.pop();
            } else {
                stack.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char s : stack) {
            sb.append(s);
        }

        return sb.toString();
    }

    public String removeDuplicates(String s) {
        // Create a stack to store characters.
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the input string.
        for (char c : s.toCharArray()) {
            // Check if the stack is not empty and the current character matches the top of the stack.
            if (!stack.isEmpty() && stack.peek() == c) {
                // If a duplicate is found, pop the character from the stack.
                stack.pop();
            } else {
                // If no duplicate is found, push the character onto the stack.
                stack.push(c);
            }
        }
        
        // Create a StringBuilder to build the result string.
        StringBuilder sb = new StringBuilder();
        
        // Iterate through the characters in the stack and append them to the result.
        for (char c : stack) {
            sb.append(c);
        }
        
        // Convert the StringBuilder to a String and return the result.
        return sb.toString();
    }

    public static void main(String[] args) {
        
        // Test cases to remove duplicates.
        System.out.println(removeDuplicates("abbaca"));  // Output: "ca"
        System.out.println(removeDuplicates("azxxzy"));  // Output: "ay"
        System.out.println(removeDuplicates("abba"));    // Output: ""
    }
}
