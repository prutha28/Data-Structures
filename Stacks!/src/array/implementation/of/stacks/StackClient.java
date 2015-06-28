package array.implementation.of.stacks;

public class StackClient {
	
	public static void main(String[] args) {
		Stack stackOfIntegers  = new Stack() ;
		stackOfIntegers.push(100) ;
		stackOfIntegers.push(900) ;
		stackOfIntegers.push(90) ;
		stackOfIntegers.push(10) ;
		System.out.println("After Pushing elements : ");
		stackOfIntegers.print() ;
		
		stackOfIntegers.pop() ;
		System.out.println("After Popping elements : ");
		stackOfIntegers.print() ;
	
		stackOfIntegers.pop() ;
		System.out.println("After Popping elements : ");
		stackOfIntegers.print() ;
		
		stackOfIntegers.pop() ;
		System.out.println("After Popping elements : ");
		stackOfIntegers.print() ;
		
		stackOfIntegers.pop() ;
		System.out.println("After Popping elements : ");
		stackOfIntegers.print() ;
	}
}
