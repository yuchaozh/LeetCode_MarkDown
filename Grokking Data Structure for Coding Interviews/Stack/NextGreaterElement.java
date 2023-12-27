import java.util.Arrays;
import java.util.Stack;

class NextGreaterElement {
    public static int[] printNGE(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? - 1 : stack.peek();
            stack.push(arr[i]);
        }

        return res;
    }
    
    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        int arr2[] = {4, 5, 2, 25};
        int arr3[] = {13, 7, 6, 12};
        
        // Find and print the Next Greater Element (NGE) for each array
        System.out.println(Arrays.toString(printNGE(arr)));
        System.out.println(Arrays.toString(printNGE(arr2)));
        System.out.println(Arrays.toString(printNGE(arr3)));
    }
}
