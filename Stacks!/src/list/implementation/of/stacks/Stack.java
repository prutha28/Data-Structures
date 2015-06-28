package list.implementation.of.stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.NoSuchElementException;

/** 
 * List implementation of stack
 * Not a fixed size implementation
 * Includes methods for adding, extraction and retrival.
 * @author prutha!
 *
 */
public class Stack {

	// variables
	private List<Object> elementList = new ArrayList<Object>();
	private int top = -1 ;

	// methods
	public void push( Object element ){
		try{
			top++;
			elementList.add(top, element) ;
		}catch (Exception e) {
			System.out.println("Exception occurred!");
		}
	}
	/**
	 *  This method simply removes the element or pops the element at the top of the stack.
	 *  If there is no element at the top of the stack, it throws an EmptyStackException.
	 * @return
	 */
	public Object pop(){
		Object element = 0 ;
		try {
			element = elementAtTop() ;
			elementList.set(top, null) ;
			top--;
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		return element ;
	}

	public boolean isEmpty(){
		if( top == -1){
			return true ;
		}
		return false ;
	}

	public int size(){
		//		return elementList.size() ;
		return ( top + 1) ;
	}

	public void print() {
		int counter = top ;
		while( counter > -1 && counter < elementList.size()) {
			System.out.println(elementList.get(counter));
			counter--;
		}
	}
	public Object elementAtTop() {
		return elementList.get(top) ;
	}

	public boolean containElement( Object x) {
		boolean contains = false ;
		for( int counter = top ; counter > -1; counter--){
			if( elementList.get(counter) == x ){
				contains = true ;
			}
		}
		return contains ;
	}
}
