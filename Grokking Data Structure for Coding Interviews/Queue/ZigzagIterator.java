import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ZigzagIterator {
    private Queue<Iterator<Integer>> queue;
    
    public void printInZigzag(List<Integer> v1, List<Integer> v2) {
        queue = new LinkedList<>();

        if (!v1.isEmpty()) {
            queue.add(v1.iterator());
        }

        if (!v2.isEmpty()) {
            queue.add(v2.iterator());
        }
    }

    public int next() {
        Iterator<Integer> iter = queue.poll();
        int value = iter.next();
        if (iter.hasNext()) {
            queue.add(iter);
        }
        return value;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public static void main(String[] args) {
        ZigzagIterator i = new ZigzagIterator();
        i.printInZigzag(Arrays.asList(1, 2), Arrays.asList(3, 4, 5, 6));
        System.out.println(i.next());  // returns 1
        System.out.println(i.next());  // returns 3
        System.out.println(i.next());  // returns 2
        System.out.println(i.next());  // returns 4
        System.out.println(i.next());  // returns 5
        System.out.println(i.next());  // returns 6
        System.out.println(i.hasNext());  // returns false
    }
}
