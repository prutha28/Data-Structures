package array.implementation.of.stacks;

// Array implementation of stack.
// A fixed size stack.. so we will have methods that return nulls/ booleans

public class Stack {

	public static final int MAX_SIZE = 10 ;

	// variables
	// The elements stored in the stack.
	private int[] elementArray = new int[MAX_SIZE];
	// The index for the top of the stack .. initially -1 
	private int top = -1 ;

	// constructors
	
	public Stack( int[] elementArray){
		this.elementArray  = elementArray ;
	}
	
	// methods
	
	public Stack() {
	}

	/**
	 * This method simply adds the specified element to the top of the stack.
	 * If element was added successfully, it returns true, else returns false.
	 * @param element
	 */
	public boolean push( int element){
		boolean isSuccessful = false ;
		if( top < MAX_SIZE){
			top++ ;
			elementArray[top] = element ;
			isSuccessful  = true ;
//			System.out.println("Push : " + elementArray[top]);
		}else{
			System.out.println("Stack Overflow");
		}
		return isSuccessful ;
	}

	/**
	 * This method pops out ( removes ) the element currently at the top of the stack.
	 * If the stack is empty it will throw NoSuchElementException. 
	 * @return element at the top of the stack.
	 */
	public int pop(){
		int element = 0;
		if( top > -1){
			element = elementArray[top];
			top--;
		}else{
			System.out.println("Stack is empty.");
		}
			
		return element ;
	}


	public boolean isEmpty(){
		if( top == -1 ){
			return true ;
		}
		return false ;
	}


	public int size(){
		return ( top + 1) ;
	}
	
	public int elementAtTop(){
		return elementArray[top] ; 
	}
	
	
	public void print(){
		System.out.println("Elements in the array are :");
		int counter = top ;
		while( counter > -1 && counter < MAX_SIZE){
			System.out.println(elementArray[counter]);
			counter-- ;
		}
	}
}
