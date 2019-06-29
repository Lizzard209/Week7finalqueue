
public class MyQueue {
	RuntimeException problem = new RunTimeException("Queue Underflow");
	RuntimeException problem1 = new RunTimeException("Queue Overflow");

	private int front;
	private int rear;
	private int capacity;
	private char queuearray[];

	MyQueue(int c) {
		capacity = c;
		front = 0;
		rear = 0;
		queuearray = new char[capacity];
	}

	public void dequeue(char subtract) {
		if (isEmpty()) {
			throw problem;
		} else {
			for (int i = 0; i < rear - 1; i++) {
				queuearray[i] = queuearray[i + 1];
			}
			if (rear < capacity) {
				queuearray[rear] = 0;
				rear--;
			}
		}
	}

	public void enqueue(char add) {
		if (isFull()) {
			throw problem1;
		} else {
			queuearray[rear] = add;
			rear++;
			 System.out.println(add + " was added to queue");
		}
	}

	private boolean isFull() {
		return (capacity > 10);
	}

	private boolean isEmpty() {

		return (size() == 0);
	}

	private int size() {

		return capacity;
	}

	public void print() {

		
			System.out.println(queuearray);
		
	}
}
