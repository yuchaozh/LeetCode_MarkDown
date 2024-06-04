import java.util.LinkedList;
import java.util.Queue;

class GenerateBinaryNumbers {
    public String[] generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");   // Initialize the queue with "1".

        String[] results = new String[n];
        for (int i = 0; i < n; i++) {
            results[i] = q.poll();  // Dequeue the current binary number and add it to the result array
            q.add(results[i] + "0");  // Enqueue the next binary number by appending "0"
            q.add(results[i] + "1");  // Enqueue the next binary number by appending "1"
        }

        return results;
    }

    public static void main(String[] args) {
        GenerateBinaryNumbers sol = new GenerateBinaryNumbers();
        String[] binaryNums = sol.generateBinaryNumbers(5);  // Generate binary numbers for testing.
        for (String binaryNum : binaryNums) {
            System.out.println(binaryNum);  // Print each generated binary number.
        }
    }
}
