package list.implementation.of.stacks;


public class StackClient {
	
	public static void main(String[] args) {
		Stack stackOfIntegers  = new Stack() ;
		stackOfIntegers.push(100) ;
		stackOfIntegers.push(900) ;
		stackOfIntegers.push(90) ;
		stackOfIntegers.push(10) ;
		System.out.println("After Pushing elements, size of stack is " + stackOfIntegers.size());
		stackOfIntegers.print() ;
		
		System.out.println((stackOfIntegers.containElement(100)== true) ? "100 present" 
				:"100 not present");
		
		int noOfElements =  stackOfIntegers.size() ;
		
		for (int i = 0; i < noOfElements; i++) {
			System.out.println();
			System.out.println("Popping " + stackOfIntegers.elementAtTop());
			stackOfIntegers.pop() ;
			System.out.println("After Popping elements size is now " + stackOfIntegers.size());
			stackOfIntegers.print() ;
		}
	}
}
