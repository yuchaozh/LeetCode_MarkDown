import java.util.Stack;

class MakeGood {
    public String makeGood(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        
        Stack<Character> stack = new Stack<>();
        for (Character s : str.toCharArray()) {
            if (!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(s) && stack.peek() != s) {
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
    public static void main(String[] args) {
        MakeGood solution = new MakeGood();
        System.out.println(solution.makeGood("AaBbCcDdEeff"));  // Output: "ff"
        System.out.println(solution.makeGood("abBA"));  // Output: ""
        System.out.println(solution.makeGood("s"));  // Output: "s"
    }
}
