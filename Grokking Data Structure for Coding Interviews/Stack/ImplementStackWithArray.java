class ImplementStackWithArray {
    private int[] stack;
    private int size;
    private int capacity;

    public ImplementStackWithArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        size = -1;
    }

    public void push(int value) {
        if (size == this.capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        // because we set initial index to -1, so we need to increase first then set.
        stack[++size] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        // we need to get the value first then reduce.
        return stack[size--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[size];
    }

    public boolean isEmpty() {
        return size == -1;
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        ImplementStackWithArray stack = new ImplementStackWithArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek()); // Output: 30

        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Popped: " + stack.pop()); // Output: 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        stack.pop(); // Popping last element
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}