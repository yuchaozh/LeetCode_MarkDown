import java.util.Arrays;

class ImplementStackWithArrayV2 {
    private final int[] elements;
    private int top;

    public ImplementStackWithArrayV2(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.elements = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == elements.length - 1;
    }

    public int size() {
        return top + 1;
    }

    public int capacity() {
        return elements.length;
    }

    public void clear() {
        top = -1;
    }

    public int[] toArray() {
        return Arrays.copyOf(elements, size());
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    public static void main(String[] args) {
        ImplementStackWithArrayV2 stack = new ImplementStackWithArrayV2(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("V2 stack: " + stack);          // [10, 20, 30]
        System.out.println("V2 top: " + stack.peek());      // 30
        System.out.println("V2 size: " + stack.size());     // 3

        System.out.println("V2 pop: " + stack.pop());       // 30
        System.out.println("V2 stack: " + stack);          // [10, 20]

        stack.clear();
        System.out.println("V2 empty: " + stack.isEmpty()); // true
    }
}
