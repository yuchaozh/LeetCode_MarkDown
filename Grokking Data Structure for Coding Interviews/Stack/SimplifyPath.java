import java.util.Stack;

class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for (String s : path.split("/")) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.isEmpty() && !s.equals(".")) {
                stack.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        // this is not LIFO!
        for (String s : stack) {
            sb.append("/");
            sb.append(s);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(simplifyPath("/a//b////c/d//././/..")); // Expected output: "/a/b/c"
        System.out.println(simplifyPath("/../")); // Expected output: "/"
        System.out.println(simplifyPath("/home//foo/")); // Expected output: "/home/foo"
    }
}
