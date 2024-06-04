import java.util.LinkedList;
import java.util.Queue;

class StackUseTwoQueues {
    Queue<Integer> main = new LinkedList<>();
    Queue<Integer> aux = new LinkedList<>();

    public void push(int x) {
        aux.add(x);
        while (!main.isEmpty()) {
            aux.add(main.poll());
        }

        // Swap 'main' and 'aux' Queues to maintain the correct stack order
        Queue<Integer> temp = main;
        main = aux;
        aux = temp;
    }

    public int pop() {
        return main.poll();
    }

    public static void main(String[] args) {
        StackUseTwoQueues stack = new StackUseTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());  // Should print 3 (last pushed element)
        System.out.println(stack.pop());  // Should print 2 (element pushed before 3)
    }
}
