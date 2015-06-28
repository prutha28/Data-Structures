package implementation.using.lists;

import java.util.ArrayList;
import java.util.List;

public class Queue {

		// variables
		private List<Integer> elementList = new ArrayList<Integer>() ; 
		/**
		 * Initially both these are -1 when the queue is empty.
		 * As the queue grows in size, start points to the head of the queue 
		 * & end points to the tail of the queue.
		 */
		private int head = -1 ;
		private int tail = -1 ;
		
		/**
		 * The method adds the specified element to the head of the queue.
		 * @param element
		 */
		public void enQueue( int element) {
			head = 0  ;
			elementList.add(head, element) ;
			tail++ ;
		}
		
		/** 
		 * This method removes/ dequeues the element present at the end / tail of the queue.
		 * returns null if queue is empty.
		 * @return element at the tail
		 */
		public Integer deQueue() {
			Integer element = elementList.get(tail) ;
			tail--;
			return element ;
		}
		
		
		public int size(){
			return ( tail + 1) ;
		}
		
		public boolean isEmpty(){
			return (tail == -1) ? true : false ;
		}
		
		public int elementAtHead(){
			return elementList.get(head) ;
		}
		
		public int elementAtTail(){
			return elementList.get(tail) ;
		}

		public void print() {
			System.out.println("Printing elements from head to tail.");
			System.out.print("-----> ");
			for(int counter = head; counter <= tail ; counter++ ){
				System.out.print(elementList.get(counter) + "  ");
			}
			System.out.println(" ----->");
		}
	}
