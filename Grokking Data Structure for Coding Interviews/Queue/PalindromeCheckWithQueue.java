import java.util.Deque;
import java.util.LinkedList;

class PalindromeCheckWithQueue {
    public boolean checkPalindrome(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == ' ') {
                continue;
            }
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeCheckWithQueue sol = new PalindromeCheckWithQueue();
        System.out.println(sol.checkPalindrome("madam"));  // returns: True
        System.out.println(sol.checkPalindrome("openai"));  // returns: False
        System.out.println(sol.checkPalindrome("A man a plan a canal Panama"));  // returns: True
    }
}
