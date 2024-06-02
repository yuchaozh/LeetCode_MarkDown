import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    static Queue<Integer> queue;

    static Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }

        return q;
    }

    public static void main(String[] args) {
        queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        reverseQueue(queue);

        System.out.println(queue);
    }
}
