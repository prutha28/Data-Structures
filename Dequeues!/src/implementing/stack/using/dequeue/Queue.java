package implementing.stack.using.dequeue;

import implementing.dequeues.using.doubly.linked.lists.Dequeue;

/**
 * This implementation of queue using a dequeue is an example of adapter pattern.
 * We have specifically chosen some of the methods of Dequeue in our implementation.
 * 
 * ADAPTER PATTERN : implements a method using the methods of another class.
 * 				   : specializes a general class.
 *  
 * @author prutha!
 *
 */

public class Queue implements IQueue {

	Dequeue dq = new Dequeue() ;

	public void enqueue(int data) throws QueueEmptyException {
		dq.insertLast(data) ;
	}

	public int dequeue() throws QueueEmptyException {
		return dq.removeFirst() ;
	}

	public int front() throws QueueEmptyException {
		return dq.first() ;
	}

	public int size() {
		return dq.size() ;
	}

	public boolean isEmpty() {
		return dq.isEmpty();
	}

}
