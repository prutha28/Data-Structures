package recursion;

public class PrintNumbers {

	public static void main(String[] args) {
			new PrintNumbers() ;
	}

	public PrintNumbers(){
		int n = 10 ;
		System.out.println("Printing the first " + n +  " numbers" + " ...");
		printNumbers( n ) ;
	}

	private void printNumbers(int n) {
	
		if ( n <= 0 ) return ;
		
		printNumbers(n -1 ) ;
		System.out.println(n);
		
	}
}
