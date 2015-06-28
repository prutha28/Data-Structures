package fibonacci;

public class Fibonacci {


	public static int fibonnaci( int n ){

		if( n < 0 )
			throw new IllegalArgumentException() ;

		else if( n == 0 || n == 1)
			return n ;

		else 
			return (fibonnaci( n - 1 ) +  fibonnaci( n - 1 )) ; 

		/*
		int fib1, fib2 ;
		fib1 = fibonnaci( n - 1 ) ;	// de-composing
		fib2 = fibonnaci( n - 2 ) ; // de-composing
		return ( fib1 + fib2 ) ;	// re-composing
		 */
	}
}
