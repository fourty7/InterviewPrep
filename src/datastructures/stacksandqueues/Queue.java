package datastructures.stacksandqueues;

public class Queue {
	
	private final static int INITIAL_SIZE=8;

	int[] dataArray = new int[INITIAL_SIZE];
	int head, tail;
	
	public void enqueue(int element) {
		dataArray[tail] = element;
		++tail;
		if(tail == dataArray.length) {
			resizeArray(2 * dataArray.length);
		}
	}
	
	public int dequeue() {
		int result = dataArray[head];
		head = head + 1;
		if(tail - head < dataArray.length/4) {
			resizeArray(dataArray.length/2);
		}
		return result;
	}
	
	private void resizeArray(int length) {
		if(length < INITIAL_SIZE) {
			return;
		}
		
		final int[] newDataArray = new int[length];
		for(int i = head; i<tail; i++) {
			newDataArray[i-head] = dataArray[i];
		}
		tail = tail - head;
		head = 0;
		dataArray = newDataArray;		
	}

	public static void main(String[] args) {
		final Queue queue = new Queue();
		queue.enqueue(10);
		queue.dequeue();
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		for (int i = 0; i < 100; ++i)
			queue.enqueue(i);
		for (int i = 0; i < queue.dataArray.length; ++i)
			System.out.println(queue.dataArray[i]);
	}

}
