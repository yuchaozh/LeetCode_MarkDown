class TwoStacksWithArray {
    int size;
    int top1, top2;
    int[] arr;

    TwoStacksWithArray(int n) {
        arr = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    void push1(int x)  {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        // Assuming the array has a size of 5
        TwoStacksWithArray ts = new TwoStacksWithArray(5);
        
        ts.push1(5);                                 // Push 5 onto stack 1
        ts.push2(10);                                // Push 10 onto stack 2
        ts.push2(15);                                // Push 15 onto stack 2
        ts.push1(11);                                // Push 11 onto stack 1
        ts.push2(7);                                 // Push 7 onto stack 2
        System.out.println("Popped element from stack1 is: " + ts.pop1()); // Pop from stack 1
        ts.push2(40);                                // Push 40 onto stack 2
        System.out.println("Popped element from stack2 is: " + ts.pop2()); // Pop from stack 2
    }
}
