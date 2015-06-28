package recursion;

public class ArrayBackwards {

	public static void main(String[] args) {
		new ArrayBackwards() ;

	}

	public ArrayBackwards(){

		int[] a = { 1, 2, 33, 44, 55, 66, 88 } ;
		arrayBackwards( a , a.length) ;
	}

	private void arrayBackwards( int[] a , int len ) {
		if ( len <= 0 ){
			return ;
		}
		System.out.printf("%4d", a[len - 1]);
		arrayBackwards(a, --len) ;
		
	}
}
