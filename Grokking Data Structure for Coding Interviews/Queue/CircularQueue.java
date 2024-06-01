class CircularQueue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }

    public void enqueue(int element) {
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            System.out.println("Queue is full");
        } else if (front == -1) {  // insert first element
            front = 0;
            rear = 0;
            queue[rear] = element;
        } else if (rear == size - 1 && front != 0) {  // insert at the right bound element of the array
            rear = 0;
            queue[rear] = element;
        } else {
            rear = rear + 1;
            queue[rear] = element;
        }
    }

    public int dequeue(){
        if (front == -1) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        int data = queue[front];
        queue[front] = -1;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return data;
    }

    public void displayQueue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Elements in the Circular Queue are: ");
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        // Inserting elements in the queue
        q.enqueue(14);
        q.enqueue(22);
        q.enqueue(13);
        q.enqueue(-6);

        // Display elements present in the queue
        q.displayQueue();

        // Deleting elements from the queue
        System.out.println("Deleted value = " + q.dequeue());
        System.out.println("Deleted value = " + q.dequeue());

        q.displayQueue();

        q.enqueue(9);
        q.enqueue(20);
        q.enqueue(5);

        q.displayQueue();

        q.enqueue(20);
    }
}
