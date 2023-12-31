import java.util.Stack;

class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<>();

        while (!input.isEmpty()) {
            int temp = input.pop();
            
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                input.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        return tempStack;
    }

    public static void main(String args[]) {
        // Create a new stack called 'input'
        Stack<Integer> input = new Stack<Integer>();
        
        // Add elements to the 'input' stack
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
        
        // Display the original input stack
        System.out.println("Input: " + input);
        
        // Call the sort method to sort the input stack
        Stack<Integer> sortedOutput = sortStack(input);
        
        // Display the sorted output stack
        System.out.println("Sorted Output: " + sortedOutput);
    }
}
