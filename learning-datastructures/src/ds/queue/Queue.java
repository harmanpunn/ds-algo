package ds.queue;

public class Queue {

	private int maxSize; // initializes the set number of slots
	private long[] queArray; // slots to main the data
	private int front; // front element
	private int rear;
	private int nItems;

	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0; // index position of first slot of the array
		rear = -1; // there is no item in the array yet to be considered as the
					// last item.
		nItems = 0; // no elements
	}

	public void insert(long j) {
		
		if(rear == maxSize - 1) {  // act as a circular queue
			rear = -1;
		}
		rear++;
		queArray[rear] = j;
		nItems++;
	}

	public long remove() {
		long temp = queArray[front];
		front++;
		if (front == maxSize) {
			front = 0;  // set front back to 0th index so that we can utilize the array again
		}
		nItems--;
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(queArray[i] + " ");
		}
		System.out.print("]");
	}
}
