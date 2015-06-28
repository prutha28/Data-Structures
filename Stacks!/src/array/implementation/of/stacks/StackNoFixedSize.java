package array.implementation.of.stacks;

import java.util.NoSuchElementException;
// Array implementation of stack.
// A fixed size stack.. so we will not have methods that return nulls/ booleans
// Only methods that throw an exception in case of failures.
public class StackNoFixedSize {

	// variables

	int initialCap = 10 ;
	// The elements stored in the stack.
	private int[] elementArray = new int[initialCap];
	// The counter for the top of the stack .. initially -1 
	private int top = -1 ;

	// methods

	/**
	 * This method simply adds the specified element to the top of the stack.
	 * If the element is not added successfully due to stack size restriction,
	 * an IllegalStateException is thrown 
	 * @param element
	 */
	public void push( int element){
		try{
			top++ ;
			if( top >= initialCap){
				elementArray[top] = new Integer(element) ;
			}
			elementArray[top] = element ;
		}catch(IllegalStateException e){
			System.out.println("Unable to add element to the stack.");
		}
	}

	/**
	 * This method pops out ( removes ) the element currently at the top of the stack.
	 * If the stack is empty it will throw NoSuchElementException. 
	 * @return element at the top of the stack.
	 */
	public int pop(){
		int element = 0;
		try {
			element = elementArray[top];
			top--;
		} catch (NoSuchElementException e) {
			System.out.println("The Stack was empty." + e.getStackTrace());
		}
		return element ;
	}


	public boolean isEmpty(){
		if( size() == 0 ){
			return true ;
		}
		return false ;
	}


	public int size(){
		return ( top + 1) ;
	}
}
