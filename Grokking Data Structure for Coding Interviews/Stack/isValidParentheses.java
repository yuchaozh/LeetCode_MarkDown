import java.util.Stack;

class isValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == '}' && top != '{') {
                    return false;
                }
                if ( c == ']' && top != '[') {
                    return false;
                }
                if ( c == ')' && top != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases to verify the solution
        String test1 = "{[()]}"; 
        String test2 = "{[}]";  
        String test3 = "(]";   
        
        System.out.println("Test 1: " + isValid(test1));
        System.out.println("Test 2: " + isValid(test2));
        System.out.println("Test 3: " + isValid(test3));
    }
}
