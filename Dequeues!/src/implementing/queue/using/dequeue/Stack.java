package implementing.queue.using.dequeue;

import implementing.dequeues.using.doubly.linked.lists.Dequeue;

public class Stack implements IStack {

	Dequeue dq = new Dequeue() ;
	
	public void push(int data) {
		dq.insertLast(data) ;
	}

	public int pop() throws StackEmptyException {
		return dq.removeLast() ;
	}

	public int top() throws StackEmptyException {
		return dq.last() ;
	}

	public int size() {
		return dq.size() ;
	}

	public boolean isEmpty() {
		return dq.isEmpty();
	}

}
